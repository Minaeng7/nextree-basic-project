package com.subject.basicproject.Controller;

import com.subject.basicproject.Entity.FAQ;
import com.subject.basicproject.Service.FAQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/faq")
public class FAQController {
    @Autowired
    public FAQService service;

    @PostMapping("/getFaqList")
    public List<FAQ> getFaqList() {
        return service.getFaqList();
    }

    @PostMapping("/getFaq")
    public FAQ getFaq(String id) { return service.getFaq(id); }

    @PostMapping("/regFaq")
    public void regFaq(@RequestBody FAQ faq){
        service.regFaq(faq);
    }

    @PostMapping("/modFaq")
    public void modFaq(FAQ faq) { service.modFaq(faq); }

    @PostMapping("/delFaq")
    public void deleteFaq(String id) {service.deleteFaq(id); }
}
