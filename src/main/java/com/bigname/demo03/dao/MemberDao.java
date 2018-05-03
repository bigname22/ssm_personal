package com.bigname.demo03.dao;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bigname.demo03.core.Member;

// 用户map
public interface MemberDao {
	Member selectMemberByName(@Param("name")String name);

	Integer updateMember(@Param("member")Member member);

	Integer addMember(@Param("member") Member member);
}
