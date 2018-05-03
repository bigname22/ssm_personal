package com.bigname.demo03.function;

import com.bigname.demo03.dto.ChapterDTO;
import com.bigname.demo03.dto.EvaluateDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IChapterFunction {
	
	// 获取章节
	List<ChapterDTO> getChapter(int courseId);

	// 设置章节
	Integer setChapter(ChapterDTO chapterDTO);
}
