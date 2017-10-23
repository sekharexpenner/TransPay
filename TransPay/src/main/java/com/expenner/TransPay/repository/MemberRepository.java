package com.expenner.TransPay.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.expenner.TransPay.model.Member;

public interface MemberRepository extends MongoRepository<Member, Serializable>{

}
