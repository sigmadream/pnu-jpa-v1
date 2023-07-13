package com.sangkon.pnujpav5.repository;

import com.sangkon.pnujpav5.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
