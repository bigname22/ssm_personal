package com.bigname.demo03.dao;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bigname.demo03.core.Member;

// ��ʵ�������mapper
public interface MemberDao {
	Member selectMemberByName(@Param("name")String name);
}
