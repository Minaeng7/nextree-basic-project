package com.subject.basicproject.Entity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class QnA {
    String id;
    String questionTitle;
    String questionContents;
    String answer;
    User quesUser;
    User ansUser;
    String regDate;
    String ansDate;
}