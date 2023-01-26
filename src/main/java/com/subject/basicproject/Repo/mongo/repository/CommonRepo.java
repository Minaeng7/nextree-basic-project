package com.subject.basicproject.Repo.mongo.repository;

import com.subject.basicproject.Repo.mongo.Doc.SideMenuDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommonRepo extends MongoRepository<SideMenuDoc, String> {

    List<SideMenuDoc> findAll();
}
