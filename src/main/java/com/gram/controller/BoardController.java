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
import org.springframework.web.servlet.view.RedirectView;

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
    public void Join(@RequestBody User user){
        userService.userJoin(user);
        userService.findAll();
    }
}
