package com.bigname.demo03.dao;


import com.bigname.demo03.core.Article;
import com.bigname.demo03.core.Course;
import com.bigname.demo03.dto.ArticleDTO;
import com.bigname.demo03.dto.CourseDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseDao {
	// 获取内容
	List<Course> getCourse(@Param("tab") String tab);

	// 设置内容
    Integer setCourse(@Param("coursedto") CourseDTO courseDTO);

	// 获取内容 通过id查找
	Course getCourseById(@Param("id") int id);
}
