package com.gram.domain;

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
public class User implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String userid;

    @Column
    private String password;

    @Column
    private LocalDateTime joinDate;

    @Builder
    public User(String userid, String password, LocalDateTime joinDate){
        this.userid = userid;
        this.password = password;
        this.joinDate = joinDate;
    }
}
