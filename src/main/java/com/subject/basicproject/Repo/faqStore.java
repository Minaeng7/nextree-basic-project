package com.subject.basicproject.Repo;

import com.subject.basicproject.Entity.FAQ;

import java.util.List;

public interface faqStore {

    void create(FAQ faq);
    void createAll(List<FAQ> faqs);
    void update(FAQ faq);
    void delete(FAQ faq);
    void delete(String id);
    void deleteAll(List<String> ids);
    boolean exists(Long id);
    FAQ retrieveById(String id);

    List<FAQ> retrieveAll();


}
