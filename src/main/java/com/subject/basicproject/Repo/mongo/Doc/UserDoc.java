package com.subject.basicproject.Repo.mongo.Doc;

import com.subject.basicproject.Entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@NoArgsConstructor
@Getter
@Setter
public class UserDoc {
    private String userId;
    private String userName;
    private String password;
    private String auth;

    public UserDoc(User user) {
        super();
        BeanUtils.copyProperties(user, this);
    }

    public User toEntity() {
        User user = new User();
        BeanUtils.copyProperties(this, user);
        return user;
    }

}
