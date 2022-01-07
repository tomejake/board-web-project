package com.gram.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
@Table
public class Board {
    @Id
    @Column
    @GeneratedValue
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

    @Builder
    public Board(String userid, String title, String content, BoardType boardType, LocalDateTime writeDate, LocalDateTime modifyDate){
        this.userid = userid;
        this.title = title;
        this.content = content;
        this.boardType = boardType;
        this.writeDate = writeDate;
        this.modifyDate = modifyDate;
    }
}
