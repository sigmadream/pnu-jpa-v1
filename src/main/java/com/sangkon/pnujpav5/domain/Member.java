package com.sangkon.pnujpav5.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Member {
    @Id
    @GeneratedValue
    private Integer id;

    @Setter
    private String name;

    @Setter
    @Getter
    @ManyToOne
    private Team team;
}
