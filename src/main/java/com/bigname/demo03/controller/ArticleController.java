package com.bigname.demo03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigname.demo03.dto.ArticleDTO;
import com.bigname.demo03.dto.RequestResult;
import com.bigname.demo03.function.IArticleFunction;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ArticleController {
	@Autowired
	IArticleFunction iArticleFunction;

	/*
	*  desc: 获取热门文章
	* */
	@RequestMapping(value = "/hotArticles")
	@ResponseBody
	public RequestResult getHotArticles () {
		System.out.println("热门文章");
		List<ArticleDTO> aDTOList = iArticleFunction.getHotArticles();
		RequestResult result = new RequestResult();
		result.setData(aDTOList);
		result.setSuccess(true);
		if (aDTOList != null) {
			result.setCode(999);
		}
		return result;
	}

	@RequestMapping(value = "/getArticleById")
    @ResponseBody
    public RequestResult getArticleById(int id) {
        ArticleDTO aDTO = iArticleFunction.getArticleById(id);
        RequestResult result = new RequestResult.Builder().isSuccess(true).code(999).data(aDTO).build();
        return result;
    }

	@RequestMapping(value = "/d")
	public void d () {
		System.out.println("dddd");
	}
}
