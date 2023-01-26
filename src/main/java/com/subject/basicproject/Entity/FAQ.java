package com.subject.basicproject.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class FAQ {
    String id;
    String title;
    String contents;
    User user;
}
