package com.gram.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
@Entity
@Table
public class User {
    @Id
    @Column
    @GeneratedValue
    private Long idx;

    @Column
    private String userid;

    @Column
    private String password;

    @Column
    private LocalDate joinDate;
}
