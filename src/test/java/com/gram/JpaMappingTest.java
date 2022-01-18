package com.gram;

import com.gram.domain.Board;
import com.gram.domain.User;
import com.gram.domain.eums.BoardType;
import com.gram.repository.BoardRepository;
import com.gram.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class JpaMappingTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BoardRepository boardRepository;

    @BeforeEach
    public void init() {
        User user = userRepository.save(User.builder()
                .userid("testid")
                .password("testpw")
                .joinDate(LocalDateTime.now())
                .build());

        Board board = boardRepository.save(Board.builder()
                .title("testtitle")
                .content("testcontent")
                .boardType(BoardType.free)
                .writeDate(LocalDateTime.now())
                .modifyDate(LocalDateTime.now())
                .build());
    }

    @Test
    public void japMappingTest() {
        List<User> user = userRepository.findAll();
        assertThat(user.get(0).getUserid()).isEqualTo("testid");
        assertThat(user.get(0).getPassword()).isEqualTo("testpw");

        List<Board> board = boardRepository.findAll();
        assertThat(board.get(0).getTitle()).isEqualTo("testtitle");
        assertThat(board.get(0).getContent()).isEqualTo("testcontent");
        assertThat(board.get(0).getBoardType()).isEqualTo(BoardType.free);
    }

}
