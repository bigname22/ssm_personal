package com.bigname.demo03.function.impl;

import com.bigname.common.CoreToDtoUtil;
import com.bigname.demo03.core.Chapter;
import com.bigname.demo03.core.Course;
import com.bigname.demo03.core.Evaluate;
import com.bigname.demo03.dao.ArticleDao;
import com.bigname.demo03.dao.ChapterDao;
import com.bigname.demo03.dao.CourseDao;
import com.bigname.demo03.dao.EvaluateDao;
import com.bigname.demo03.dto.ArticleDTO;
import com.bigname.demo03.dto.CourseDTO;
import com.bigname.demo03.function.IArticleFunction;
import com.bigname.demo03.function.ICourseFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseFunctionImpl implements ICourseFunction{

	@Autowired
	CourseDao cDao;

	@Autowired
	ChapterDao chapterDao;

	@Autowired
	EvaluateDao evaluateDao;



	/* 获取内容 */
	public List<CourseDTO> getCourse(String tab) {
		List<CourseDTO> courseDTOs = CoreToDtoUtil.courseList2CourseDTOList(cDao.getCourse(tab));
		for(CourseDTO courseDTO : courseDTOs) {
			int courseId = courseDTO.getId();
			List<Chapter> chapters = chapterDao.getChapter(courseId);
			courseDTO.setChapterDTOList(CoreToDtoUtil.chapterList2ChapterDTOList(chapters));
			List<Evaluate> evaluates = evaluateDao.getEvaluate(courseDTO.getId(),6);
			courseDTO.setEvaluateDTOList(CoreToDtoUtil.evaluateList2EvaluateDTOList(evaluates));
		}
		return courseDTOs;
	}

	public Integer setCourse(CourseDTO courseDTO) {
		Integer result = cDao.setCourse(courseDTO);
		return result;
	}

	public CourseDTO getCourseById(int id) {
		CourseDTO courseDTO = CoreToDtoUtil.course2CourseDTO(cDao.getCourseById(id));
		List<Chapter> chapters = chapterDao.getChapter(courseDTO.getId());
		courseDTO.setChapterDTOList(CoreToDtoUtil.chapterList2ChapterDTOList(chapters));
		List<Evaluate> evaluates = evaluateDao.getEvaluate(courseDTO.getId(), 6);
		courseDTO.setEvaluateDTOList(CoreToDtoUtil.evaluateList2EvaluateDTOList(evaluates));
		return courseDTO;
	}


}
