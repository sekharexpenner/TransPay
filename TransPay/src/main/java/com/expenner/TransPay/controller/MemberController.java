package com.expenner.TransPay.controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.expenner.TransPay.bean.MemberSignUp;
import com.expenner.TransPay.model.Member;
import com.expenner.TransPay.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	MemberService memberService;

	@PutMapping()
	public void save(Member member) {

	}

	@PostMapping("/signup")
	public void memberSignUp(MemberSignUp memberSignUp) {
		logger.info("memberSignUp: memberSignup={}", memberSignUp);
		boolean success = memberService.signUp(memberSignUp);

	}

	@GetMapping("/test")
	public HashMap get(@RequestParam("name") String name) {
		HashMap<String, String> map = new HashMap();
	memberService.test();
		return map;
	}
}
