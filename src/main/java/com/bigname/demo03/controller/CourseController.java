package com.bigname.demo03.controller;

import com.bigname.demo03.core.Article;
import com.bigname.demo03.core.Course;
import com.bigname.demo03.dto.ArticleDTO;
import com.bigname.demo03.dto.CourseDTO;
import com.bigname.demo03.dto.RequestResult;
import com.bigname.demo03.function.IArticleFunction;
import com.bigname.demo03.function.ICourseFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CourseController {

	@Autowired
	ICourseFunction iCourseFunction;

	/*
	*  desc: 获取文章
	* */
	@RequestMapping(value = "/getCourse")
	@ResponseBody
	public RequestResult getArticles (String tab) {
		tab = tab == null ? "" : tab;
		List<CourseDTO> aDTOList = iCourseFunction.getCourse(tab);
		RequestResult result = new RequestResult.Builder().code(100).msg("成功").data(aDTOList).build();
		return result;
	}



	/*
	*  desc:发布内容
	* */
	@RequestMapping(value = "/publishCourse")
	@ResponseBody
	public RequestResult setContent(CourseDTO courseDTO) {
		System.out.println("接收到参数" + courseDTO);
		Integer res = iCourseFunction.setCourse(courseDTO);
		RequestResult result = new RequestResult.Builder().code(100).msg("成功").data(res).build();
		return result;
	}

	@RequestMapping(value = "/getCourseById")
	@ResponseBody
	public RequestResult getCourseById(Integer id) {
		System.out.println("接收到参数" + id);
		CourseDTO res = iCourseFunction.getCourseById(id);
		RequestResult result = new RequestResult.Builder().code(100).msg("成功").data(res).build();
		return result;
	}

}
