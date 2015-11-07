package com.prash.sample.reports.chartingapp.repo;

import java.util.List;

import com.prash.sample.reports.chartingapp.domain.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
