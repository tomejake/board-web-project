package com.gram.service;

import com.gram.domain.Board;
import com.gram.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class BoardService {

    @Autowired
    private final BoardRepository boardRepository;

    public Page<Board> findBoardList(int pageNum){
        Pageable pageable = PageRequest.of(pageNum, 10);
        return boardRepository.findAll(pageable);
    }

    public Board findBoardByIdx(Long idx){
        return boardRepository.findById(idx).orElse(new Board());
    }

    public void insertBoard(Board board){
        board = boardRepository.save(Board.builder()
                .title(board.getTitle())
                .boardType(board.getBoardType())
                .content(board.getContent())
                .writeDate(LocalDateTime.now())
                .modifyDate(LocalDateTime.now())
                .user(null)
                .build());
    }

}
