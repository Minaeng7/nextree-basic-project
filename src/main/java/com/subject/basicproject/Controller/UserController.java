package com.subject.basicproject.Controller;

import com.subject.basicproject.Entity.User;
import com.subject.basicproject.Entity.vo.Login;
import com.subject.basicproject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.annotation.MultipartConfig;
import java.util.Objects;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    public UserService service;

    @PostMapping("/regUser")
    public void regUser(@RequestBody User user) {
        service.regUser(user);
    }

    //Controller Param 넣어주기부터
    @PostMapping("/getUserData")
    public User getUserData(@RequestBody Login login) { return service.getUserDataByIdAndPw(login);}
}
