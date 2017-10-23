package com.expenner.TransPay.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expenner.TransPay.bean.MemberSignUp;
import com.expenner.TransPay.dao.MemberDao;
import com.expenner.TransPay.model.Group;
import com.expenner.TransPay.model.Member;
import com.expenner.TransPay.service.GroupService;
import com.expenner.TransPay.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	GroupService groupService;
	@Autowired
	MemberDao memberDao;

	@Override
	public boolean signUp(MemberSignUp memberSignUp) {
		Group group = new Group();
		boolean groupFlag = groupService.save(group);
		boolean memberFlag = false;
		if (groupFlag) {
			Member member = new Member(memberSignUp);
			member.setGroup(group);
			Member model = memberDao.save(member);
			if (model != null) {
				return true;
			}
		}

		return memberFlag;
	}

}
