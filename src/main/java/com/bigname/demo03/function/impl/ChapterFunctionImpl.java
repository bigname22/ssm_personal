package com.bigname.demo03.function.impl;

import com.bigname.common.CoreToDtoUtil;
import com.bigname.demo03.core.Chapter;
import com.bigname.demo03.core.Evaluate;
import com.bigname.demo03.dao.ChapterDao;
import com.bigname.demo03.dao.EvaluateDao;
import com.bigname.demo03.dto.ChapterDTO;
import com.bigname.demo03.dto.EvaluateDTO;
import com.bigname.demo03.function.IChapterFunction;
import com.bigname.demo03.function.IEvaluateFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterFunctionImpl implements IChapterFunction {

	@Autowired
	ChapterDao cDao;




	public List<ChapterDTO> getChapter(int courseId) {
		List<Chapter> chapter = cDao.getChapter(courseId);
		return CoreToDtoUtil.chapterList2ChapterDTOList(chapter);
	}

	public Integer setChapter(ChapterDTO chapterDTO) {
		Integer result = cDao.setChapter(chapterDTO);
		return result;
	}
}
