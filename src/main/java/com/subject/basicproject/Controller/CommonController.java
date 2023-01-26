package com.subject.basicproject.Controller;

import com.subject.basicproject.Entity.SideMenu;
import com.subject.basicproject.Entity.User;
import com.subject.basicproject.Service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RestController
@RequestMapping("/api/common")
public class CommonController {

    @Autowired
    public CommonService service;

    @PostMapping("/getSideMenuList")
    public List<SideMenu> getSideMenuList() {
        return service.getSideMenuList();
    }
}
