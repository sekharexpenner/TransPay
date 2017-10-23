package com.expenner.TransPay.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expenner.TransPay.dao.GroupDao;
import com.expenner.TransPay.model.Group;
import com.expenner.TransPay.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService {
	@Autowired
	GroupDao groupDao;

	@Override
	public boolean save(Group group) {
		groupDao.save(group);
		if (group != null) {
			return true;
		}
		return false;
	}

}
