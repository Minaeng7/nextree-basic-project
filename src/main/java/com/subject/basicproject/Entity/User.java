package com.subject.basicproject.Entity;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
public class User{
    String userId;
    String userName;
    String password;
    String auth;
}
