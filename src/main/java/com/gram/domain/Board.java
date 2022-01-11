package com.gram.domain;

import com.gram.domain.eums.BoardType;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
@Table
public class Board implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String userid;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    @Enumerated(EnumType.STRING)
    private BoardType boardType;

    @Column
    private LocalDateTime writeDate;

    @Column
    private LocalDateTime modifyDate;

    @OneToOne
    private User user;

    @Builder
    public Board(String userid, String title, String content, BoardType boardType, LocalDateTime writeDate, LocalDateTime modifyDate, User user){
        this.userid = userid;
        this.title = title;
        this.content = content;
        this.boardType = boardType;
        this.writeDate = writeDate;
        this.modifyDate = modifyDate;
        this.user = user;
    }
}
