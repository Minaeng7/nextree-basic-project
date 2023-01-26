package com.subject.basicproject.Service;

import com.subject.basicproject.Entity.Board;
import com.subject.basicproject.Repo.mongo.BoardMongoStore;
import com.subject.basicproject.Util.Util;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static com.subject.basicproject.Util.Util.genDate;

@Service
public class BoardService {

    private final BoardMongoStore store;

    public BoardService(BoardMongoStore store) {
        this.store = store;
    }


    public List<Board> getBoardList(){
        return store.retrieveAll();
    }

    public void regBoard(Board board) {
        board.setId(Util.genId());
        board.setCreateDate(genDate());
        board.setModDate(genDate());
        board.setViewCount(0);
        store.create(board);
    }

    public void modBoard(Board board) {
        store.update(board);
    }

    public void deleteBoard(String id) {
        store.delete(id);
    }

    public Board getBoard(String id) {
        Board board = store.retrieveById(id);
        store.update(board);
        return store.retrieveById(id);
    }
}
