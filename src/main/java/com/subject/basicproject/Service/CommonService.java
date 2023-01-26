package com.subject.basicproject.Service;

import com.subject.basicproject.Entity.SideMenu;
import com.subject.basicproject.Repo.mongo.CommonMongoStore;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonService {

    private final CommonMongoStore store;

    public CommonService(CommonMongoStore store) {
        this.store = store;
    }

    public List<SideMenu> getSideMenuList(){
        return store.retrieveAll();
    }
}
