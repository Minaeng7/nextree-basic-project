package com.subject.basicproject.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Notice {
    String id;
    String title;
    String contents;
    User user;

}
