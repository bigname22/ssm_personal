package com.bigname.demo03.controller;

import com.bigname.demo03.core.Article;
import com.bigname.demo03.core.Evaluate;
import com.bigname.demo03.dto.ArticleDTO;
import com.bigname.demo03.dto.EvaluateDTO;
import com.bigname.demo03.dto.RequestResult;
import com.bigname.demo03.function.IArticleFunction;
import com.bigname.demo03.function.IEvaluateFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EvaluateController {

	@Autowired
	IEvaluateFunction iEvaluateFunction;


	@RequestMapping(value = "/publishEvaluate")
	@ResponseBody
	public RequestResult setEvaluate(EvaluateDTO evaluateDTO) {
		Integer integer = iEvaluateFunction.setEvaluate(evaluateDTO);
		RequestResult result = new RequestResult.Builder().code(100).msg("成功").data(integer).build();
		return result;
	}
}
