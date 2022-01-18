package com.gram;

import com.gram.domain.Board;
import com.gram.domain.User;
import com.gram.domain.eums.BoardType;
import com.gram.repository.BoardRepository;
import com.gram.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

@RestController
@SpringBootApplication
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(UserRepository userRepository, BoardRepository boardRepository) throws Exception {
		return (args) -> {
			User user = userRepository.save(User.builder()
					.userid("havi")
					.password("test")
					.joinDate(LocalDateTime.now())
					.build());

			IntStream.rangeClosed(1, 200).forEach(index -> boardRepository.save(Board.builder()
					.title("게시글"+index)
					.content("콘텐츠")
					.boardType(BoardType.free)
					.writeDate(LocalDateTime.now())
					.modifyDate(LocalDateTime.now())
					.user(user)
					.build()));
		};
	}

}
