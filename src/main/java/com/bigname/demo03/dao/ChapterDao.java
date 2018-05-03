package com.bigname.demo03.dao;


import com.bigname.demo03.core.Chapter;
import com.bigname.demo03.core.Evaluate;
import com.bigname.demo03.dto.ChapterDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChapterDao {
	// 获取章节
	List<Chapter> getChapter(@Param("courseid") int courseId);

	// 添加章节
	Integer setChapter(@Param("chapterdto") ChapterDTO chapterDTO);
}
