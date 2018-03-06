package com.bigname.demo03.controller;

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
public class LoginController {
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
}
