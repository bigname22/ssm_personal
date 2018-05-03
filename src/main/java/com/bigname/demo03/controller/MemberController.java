package com.bigname.demo03.controller;

import com.bigname.common.StringUtil;
import com.bigname.demo03.core.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bigname.demo03.dto.MemberDTO;
import com.bigname.demo03.dto.RequestResult;
import com.bigname.demo03.function.IMemberFunction;

@Controller
public class MemberController {
    @Autowired
	IMemberFunction iMemberFunc;
	
	@RequestMapping(value = "/hello")
	public String hello(){
		System.out.println("maven Hello");
		return "hi";
	}
	
	@RequestMapping(value = "/login")
	@ResponseBody
	public RequestResult login(String username, String password){
		MemberDTO memberDTO = iMemberFunc.login(username, password);
		RequestResult result = new RequestResult();
		if(memberDTO == null) {
		    result.setCode(MemberDTO.CODE_ERROR_NAME);
            result.setMsg(MemberDTO.MSG_ERROR_NAME);
            result.setSuccess(true);
		}else{
			 if(password.equals(memberDTO.getPassword())) {
                 result.setCode(MemberDTO.CODE_SUCCESS);
				 result.setSuccess(true);
				 result.setData(memberDTO);
			 }else {
                 result.setCode(MemberDTO.CODE_ERROR_PASS);
                 result.setMsg(MemberDTO.MSG_ERROR_PASS);
				 result.setSuccess(true);
			 }
		}
		return result;
	}

	@RequestMapping(value = "/register")
	@ResponseBody
	public RequestResult register(String username, String password, String role){
		RequestResult.Builder builder = new RequestResult.Builder();
		if(StringUtil.isNullOrZero(username) || StringUtil.isNullOrZero(password) ||StringUtil.isNullOrZero(role)) {
			return builder.code(101).msg("参数有误").build();
		}else {
			MemberDTO mem = iMemberFunc.login(username, password);
			if (mem == null) {
				iMemberFunc.addMember(username, password, role);
				return builder.code(100).msg("成功").build();
			}else {
				return builder.code(101).msg("用户已存在").build();
			}

		}
	}

	@RequestMapping(value = "/resetPassword")
	@ResponseBody
	public RequestResult update(String username, String password){
		RequestResult.Builder builder = new RequestResult.Builder();
		if(StringUtil.isNullOrZero(username) || StringUtil.isNullOrZero(password)) {
			return builder.code(101).msg("参数有误").build();
		}else {
			iMemberFunc.updateMember(username, password);
			return builder.code(100).msg("成功").build();
		}
	}


}
