package com.expenner.TransPay.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.expenner.TransPay.dao.MemberDao;
import com.expenner.TransPay.model.Member;
import com.expenner.TransPay.repository.MemberRepository;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	MemberRepository memberRepository;

	@Override
	public Member save(Member member) {
		Member model = memberRepository.save(member);
		return model;
	}

}
