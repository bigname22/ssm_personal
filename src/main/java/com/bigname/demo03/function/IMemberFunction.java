package com.bigname.demo03.function;

import org.springframework.stereotype.Service;

import com.bigname.demo03.core.Member;
import com.bigname.demo03.dto.MemberDTO;

@Service
public interface IMemberFunction {
	MemberDTO login(String name, String passsword);
}
