package com.subject.basicproject.Controller;

import com.subject.basicproject.Entity.Notice;
import com.subject.basicproject.Service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notice")
public class NoticeController {

    @Autowired
    public NoticeService service;

    @PostMapping ("/getNoticeList")
    public List<Notice> getNoticeList() {
        return service.getNoticeList();
    }

    @PostMapping("/getNotice/{id}")
    public Notice getNotice(@PathVariable("id") String id) { return service.getNotice(id); }

    @PostMapping("/regNotice")
    public void regNotice(@RequestBody Notice notice){
        service.regNotice(notice);
    }

    @PostMapping("/modNotice")
    public void modNotice(Notice notice) { service.modNotice(notice); }

    @PostMapping("/delNotice")
    public void deleteNotice(String id) {service.deleteNotice(id); }
}
