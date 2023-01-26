package com.subject.basicproject.Repo.mongo.repository;

import com.subject.basicproject.Repo.mongo.Doc.BoardDoc;
import com.subject.basicproject.Repo.mongo.Doc.FAQDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface FAQRepo extends MongoRepository<FAQDoc, String> {


    List<FAQDoc> findAll ();
    Optional<FAQDoc> findById(String id);

}
