package com.subject.basicproject.Repo;

import com.subject.basicproject.Entity.Board;
import com.subject.basicproject.Repo.mongo.Doc.BoardDoc;

import java.util.List;


public interface boardStore {

    void create(Board board);
    void createAll(List<Board> boards);
    void update(Board board);
    void delete(Board board);
    void delete(String id);
    void deleteAll(List<String> ids);
    boolean exists(Long id);
    Board retrieveById(String id);

    List<Board> retrieveAll();


}
