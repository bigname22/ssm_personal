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

	/*
	* 	desc: 登录
	* */
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

	/*
	* 	修改用户
	* */
	public Integer updateMember(String name, String password) {
		if(StringUtil.isNullOrZero(name)){
			System.out.println("用户名为空");
			return null;
		}
		if(StringUtil.isNullOrZero(password)){
			System.out.println("密码为空");
			return null;
		}
		return mDao.updateMember(new Member(name, password));
	}

	/*
	*   添加用户
	* */
	public Integer addMember(String name, String password,String role) {
		if(StringUtil.isNullOrZero(name)){
			System.out.println("用户名为空");
			return null;
		}
		if(StringUtil.isNullOrZero(password)){
			System.out.println("密码为空");
			return null;
		}
		if(StringUtil.isNullOrZero(role)){
			System.out.println("角色为空");
			return null;
		}
		return mDao.addMember(new Member(name, password, role));
	}

}
