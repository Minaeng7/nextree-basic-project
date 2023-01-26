package com.subject.basicproject.Service;

import com.subject.basicproject.Entity.User;
import com.subject.basicproject.Entity.vo.Login;
import com.subject.basicproject.Repo.mongo.UserMongoStore;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserMongoStore store;

    public UserService(UserMongoStore store) {this.store = store;}

    public void regUser(User user) {
        user.setAuth("public");
        store.create(user);
    }
    public User getUserDataByIdAndPw(Login login) {
        return store.retrieveByIdAndPw(login.getUserId(), login.getPassword()).toEntity();
    }

}
