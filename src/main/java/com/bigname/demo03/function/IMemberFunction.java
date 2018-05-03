package com.bigname.demo03.function;

import com.bigname.demo03.dao.MemberDao;
import org.springframework.stereotype.Service;

import com.bigname.demo03.core.Member;
import com.bigname.demo03.dto.MemberDTO;

@Service
public interface IMemberFunction {
	MemberDTO login(String name, String passsword);

	Integer updateMember(String name,String password);

	Integer addMember(String name, String password, String role);
}
