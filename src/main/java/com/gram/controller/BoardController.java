package com.gram.controller;

import com.gram.domain.Board;
import com.gram.domain.User;
import com.gram.service.BoardService;
import com.gram.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    public Page<Board> list(@PageableDefault Pageable pageable){
        return boardService.findBoardList(pageable);
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
}
