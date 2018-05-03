package com.bigname.demo03.controller;

import com.bigname.demo03.dto.ChapterDTO;
import com.bigname.demo03.dto.EvaluateDTO;
import com.bigname.demo03.dto.RequestResult;
import com.bigname.demo03.function.IChapterFunction;
import com.bigname.demo03.function.IEvaluateFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChapterController {

	@Autowired
	IChapterFunction iChapterFunction;


	@RequestMapping(value = "/publishChapter")
	@ResponseBody
	public RequestResult setChapter(ChapterDTO chapterDTO) {
		Integer integer = iChapterFunction.setChapter(chapterDTO);
		RequestResult result = new RequestResult.Builder().code(100).msg("成功").data(integer).build();
		return result;
	}
}
