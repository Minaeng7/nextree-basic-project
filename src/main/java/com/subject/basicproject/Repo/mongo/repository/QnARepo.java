package com.subject.basicproject.Repo.mongo.repository;

import com.subject.basicproject.Repo.mongo.Doc.BoardDoc;
import com.subject.basicproject.Repo.mongo.Doc.QnADoc;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface QnARepo extends MongoRepository<QnADoc, String> {


    List<QnADoc> findAll ();
    Optional<QnADoc> findById(String id);

}
