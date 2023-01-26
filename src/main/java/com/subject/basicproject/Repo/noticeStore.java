package com.subject.basicproject.Repo;

import com.subject.basicproject.Entity.Notice;

import java.util.List;

public interface noticeStore {

    void create(Notice notice);
    void createAll(List<Notice> notices);
    void update(Notice notice);
    void delete(Notice notice);
    void delete(String id);
    void deleteAll(List<String> ids);
    boolean exists(Long id);
    Notice retrieveById(String id);
    List<Notice> retrieveAll();


}
