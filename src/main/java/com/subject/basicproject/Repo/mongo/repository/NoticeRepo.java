package com.subject.basicproject.Repo.mongo.repository;

import com.subject.basicproject.Repo.mongo.Doc.NoticeDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface NoticeRepo extends MongoRepository<NoticeDoc, String> {

    List<NoticeDoc> findAll ();
    Optional<NoticeDoc> findById(String id);

}
