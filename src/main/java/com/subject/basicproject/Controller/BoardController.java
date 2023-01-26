package com.subject.basicproject.Controller;

import com.subject.basicproject.Entity.Board;
import com.subject.basicproject.Service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/board")
public class BoardController {

    @Autowired
    public BoardService service;

    @PostMapping("/getBoardList")
    public List<Board> getBoardList() {
        return service.getBoardList();
    }

    @PostMapping("/getBoard/{id}")
    public Board getBoard(@PathVariable("id") String id) { return service.getBoard(id); }

    @PostMapping("/regBoard")
    public void regBoard(@RequestBody Board board){
        service.regBoard(board);
    }

    @PostMapping("/modBoard")
    public void modBoard(Board board) { service.modBoard(board); }

    @PostMapping("/delBoard")
    public void deleteBoard(String id) {service.deleteBoard(id); }
}
