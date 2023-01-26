package com.subject.basicproject.Service;

import com.subject.basicproject.Entity.FAQ;

import com.subject.basicproject.Repo.mongo.FAQMongoStore;
import com.subject.basicproject.Util.Util;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FAQService {

    private final FAQMongoStore store;

    public FAQService(FAQMongoStore store) {
        this.store = store;
    }


    public List<FAQ> getFaqList(){
        return store.retrieveAll();
    }

    public void regFaq(FAQ faq) {
        faq.setId(Util.genId());
        store.create(faq);
    }

    public void modFaq(FAQ faq) {
        store.update(faq);
    }

    public void deleteFaq(String id) {
        store.delete(id);
    }

    public FAQ getFaq(String id) {
        return store.retrieveById(id);
    }
}
