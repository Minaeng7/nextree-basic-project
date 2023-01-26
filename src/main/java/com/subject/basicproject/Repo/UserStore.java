package com.subject.basicproject.Repo;

import com.subject.basicproject.Entity.User;
import com.subject.basicproject.Repo.mongo.Doc.UserDoc;

public interface UserStore {

    void create(User user);
    void update(User user);
    void delete(String id);
    UserDoc retrieveByIdAndPw(String id, String pw);

}
