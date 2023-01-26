package com.subject.basicproject.Repo.mongo;

import com.subject.basicproject.Entity.User;
import com.subject.basicproject.Repo.UserStore;
import com.subject.basicproject.Repo.mongo.Doc.UserDoc;
import com.subject.basicproject.Repo.mongo.repository.UserRepo;
import org.springframework.stereotype.Repository;

@Repository
public class UserMongoStore implements UserStore {

    private final UserRepo repo;

    public UserMongoStore(UserRepo repo) {this.repo = repo;}
    @Override
    public void create(User user) {
        UserDoc userDoc = new UserDoc(user);
        repo.save(userDoc);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public UserDoc retrieveByIdAndPw(String id, String pw) {
        return repo.findByUserIdAndPassword(id, pw);
    }


}
