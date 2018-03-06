package com.bigname.demo03.function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigname.common.CoreToDtoUtil;
import com.bigname.common.StringUtil;
import com.bigname.demo03.core.Member;
import com.bigname.demo03.dao.MemberDao;
import com.bigname.demo03.dto.MemberDTO;

@Service
public class MemberFunctionImpl implements IMemberFunction{
	@Autowired
	MemberDao mDao;
	
	public MemberDTO login(String name, String passsword){
		System.out.println(name + passsword);
		if(StringUtil.isNullOrZero(name)){
			System.out.println("用户名为空");
			return null;
		}
		if(StringUtil.isNullOrZero(passsword)){
			System.out.println("密码为空");
			return null;
		}
		Member member = mDao.selectMemberByName(name);
		return CoreToDtoUtil.member2MemberDTO(member);
	}

}
