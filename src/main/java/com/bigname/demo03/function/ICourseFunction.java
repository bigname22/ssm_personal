package com.bigname.demo03.function;

import com.bigname.demo03.dto.ArticleDTO;
import com.bigname.demo03.dto.CourseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICourseFunction {
	
	// 获取内容
	List<CourseDTO> getCourse(String tab);

	// 增加内容
	Integer setCourse (CourseDTO courseDTO);

	// 获取内容 通过id查找
	CourseDTO getCourseById(int id);
}
