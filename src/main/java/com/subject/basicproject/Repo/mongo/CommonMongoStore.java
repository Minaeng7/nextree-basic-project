package com.subject.basicproject.Repo.mongo;

import com.subject.basicproject.Entity.SideMenu;
import com.subject.basicproject.Repo.commonStore;
import com.subject.basicproject.Repo.mongo.Doc.SideMenuDoc;
import com.subject.basicproject.Repo.mongo.repository.CommonRepo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommonMongoStore implements commonStore {

    private final CommonRepo repo;

    public CommonMongoStore(CommonRepo repo) {
        this.repo = repo;
    }
    @Override
    public List<SideMenu> retrieveAll() {
        return SideMenuDoc.toEntities(repo.findAll());
    }
}
