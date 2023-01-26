package com.subject.basicproject.Repo.mongo.Doc;

import com.subject.basicproject.Entity.User;
import com.subject.basicproject.Entity.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.stream.Collectors;

@Document(collection = "board")
@NoArgsConstructor
@Getter
@Setter
public class BoardDoc {
    private String id;
    private String title;
    private String contents;
    private User user;
    private String createDate;
    private String modDate;
    private int viewCount;

    public BoardDoc(Board board) {
        super();
        BeanUtils.copyProperties(board, this);
    }
    public Board toEntity() {
        Board board = new Board();
        BeanUtils.copyProperties(this, board);
        return board;
    }

    public static List<Board> toEntities(List<BoardDoc> boardDocs) {
        return boardDocs.stream().map(BoardDoc::toEntity).collect(Collectors.toList());
    }
}
