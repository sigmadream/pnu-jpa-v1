package com.sangkon.pnujpav5.repository;

import com.sangkon.pnujpav5.domain.Member;
import com.sangkon.pnujpav5.domain.Team;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.hamcrest.MatcherAssert.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DomainRepositoryTests {

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    MemberRepository memberRepository;

    @Test
    void testBookAndBookStore() {
        Team team = new Team();
        team.setName("PNU 카테캠");
        teamRepository.save(team);

        Member member = new Member();
        member.setName("홍길동");
        team.add(member);
        memberRepository.save(member);

        assertThat(member.getTeam(), CoreMatchers.not(CoreMatchers.nullValue()));
    }
}
