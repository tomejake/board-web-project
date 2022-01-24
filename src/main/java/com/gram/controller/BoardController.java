package com.gram.controller;

import com.gram.domain.Board;
import com.gram.domain.User;
import com.gram.service.BoardService;
import com.gram.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4000" )
@RestController
@RequestMapping("/api")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @Autowired
    private UserService userService;

    @GetMapping("/write")
    public String board(@RequestParam(value="idx", defaultValue = "0") Long idx, Model model){
        model.addAttribute("board", boardService.findBoardByIdx(idx));
        return "/board/form";
    }

    @GetMapping("/list")
    public Page<Board> list(@RequestParam int pageNum){
        return boardService.findBoardList(pageNum);
    }

    @PostMapping("/join")
    @ResponseBody
    public void join(@RequestBody User user){
        System.out.println("join.id = " + user.getUserid());
        System.out.println("join.pw = " + user.getPassword());
        userService.userJoin(user);
        userService.findAll();
    }

    @PostMapping("/login")
    @ResponseBody
    public boolean login(@RequestBody User loginData){
        System.out.println("login.id = " + loginData.getUserid());
        System.out.println("login.pw = " + loginData.getPassword());
        return userService.login(loginData);
    }

    @PostMapping("/write")
    @ResponseBody
    public void write(@RequestBody Board board){
        System.out.println("boardType == " + board.getBoardType());
        System.out.println("title == " + board.getTitle());
        System.out.println("content == " + board.getContent());
        boardService.insertBoard(board);
    }
}
