package com.subject.basicproject.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Board{
    String id;
    String title;
    String contents;
    User user;
    String createDate;
    String modDate;
    int viewCount;
}
