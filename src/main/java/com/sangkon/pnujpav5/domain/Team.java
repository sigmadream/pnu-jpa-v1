package com.sangkon.pnujpav5.domain;

import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Team {
    @Id
    @GeneratedValue
    private Integer id;

    @Setter
    private String name;

    @OneToMany(mappedBy = "team")
    private Set<Member> members = new HashSet<>();

    public void add(Member member) {
        member.setTeam(this);
        this.members.add(member);
    }

}
