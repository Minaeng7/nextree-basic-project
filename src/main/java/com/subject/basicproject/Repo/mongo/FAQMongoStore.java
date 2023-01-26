package com.subject.basicproject.Repo.mongo;


import com.subject.basicproject.Entity.FAQ;
import com.subject.basicproject.Repo.faqStore;
import com.subject.basicproject.Repo.mongo.Doc.FAQDoc;
import com.subject.basicproject.Repo.mongo.repository.FAQRepo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FAQMongoStore implements faqStore {


    private final FAQRepo repo;

    public FAQMongoStore(FAQRepo repo) {
        this.repo = repo;
    }

    @Override
    public void create(FAQ faq) {
        FAQDoc faqDoc = new FAQDoc(faq);
        repo.save(faqDoc);
    }

    @Override
    public void createAll(List<FAQ> boards) {

    }

    @Override
    public void update(FAQ faq) {
        FAQDoc faqDoc = new FAQDoc(faq);
        repo.save(faqDoc);

    }

    @Override
    public void delete(FAQ faq) {

    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }

    @Override
    public void deleteAll(List<String> ids) {

    }

    @Override
    public boolean exists(Long id) {
        return false;
    }

    @Override
    public FAQ retrieveById(String id) {
        return repo.findById(id).get().toEntity();
    }

    @Override
    public List<FAQ> retrieveAll() {
        return FAQDoc.toEntities(repo.findAll());
    }
}
