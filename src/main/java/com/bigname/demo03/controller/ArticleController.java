package com.bigname.demo03.controller;

import java.util.List;

import com.bigname.demo03.core.Article;
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
	*  desc: 获取文章
	* */
	@RequestMapping(value = "/getArticle")
	@ResponseBody
	public RequestResult getArticles () {
		List<ArticleDTO> aDTOList = iArticleFunction.getContent(Article.TYPE_ARTICLE);
		RequestResult result = new RequestResult.Builder().code(100).msg("成功").data(aDTOList).build();
		return result;
	}

	@RequestMapping(value = "/getHotArticle")
	@ResponseBody
	public RequestResult getHotArticles () {
		List<ArticleDTO> aDTOList = iArticleFunction.getContent(Article.TYPE_ARTICLE);
		RequestResult result = new RequestResult.Builder().code(100).msg("成功").data(aDTOList).build();
		return result;
	}

	/*
	* desc:获取资料
	* */
	@RequestMapping(value = "/getData")
    @ResponseBody
    public RequestResult getData() {
		List<ArticleDTO> aDTOList = iArticleFunction.getContent(Article.TYPE_DATA);
		RequestResult result = new RequestResult.Builder().code(100).msg("成功").data(aDTOList).build();
		return result;
    }

	/*
	 * desc:获取公告
	 * */
	@RequestMapping(value = "/getNotice")
	@ResponseBody
	public RequestResult getNotice() {
		List<ArticleDTO> aDTOList = iArticleFunction.getContent(Article.TYPE_NOTICE);
		RequestResult result = new RequestResult.Builder().code(100).msg("成功").data(aDTOList).build();
		return result;
	}

	/*
	 * desc:获取问答
	 * */
	@RequestMapping(value = "/getIssue")
	@ResponseBody
	public RequestResult getIssue() {
		List<ArticleDTO> aDTOList = iArticleFunction.getContent(Article.TYPE_ISSUE);
		RequestResult result = new RequestResult.Builder().code(100).msg("成功").data(aDTOList).build();
		return result;
	}

	/*
	 * desc:获取留言板
	 * */
	@RequestMapping(value = "/getMessageBroad")
	@ResponseBody
	public RequestResult getMessageBroad() {
		List<ArticleDTO> aDTOList = iArticleFunction.getContent(Article.TYPE_MESSAGE_BOARD);
		RequestResult result = new RequestResult.Builder().code(100).msg("成功").data(aDTOList).build();
		return result;
	}



	/*
	*  desc:发布内容
	* */
	@RequestMapping(value = "/publishContent")
	@ResponseBody
	public RequestResult setContent(ArticleDTO articleDTO) {
		System.out.println("接收到参数" + articleDTO);
		Integer res = iArticleFunction.setContent(articleDTO);
		RequestResult result = new RequestResult.Builder().code(100).msg("成功").data(res).build();
		return result;
	}

	@RequestMapping(value = "/getContentById")
	@ResponseBody
	public RequestResult getContentById(Integer id) {
		System.out.println("接收到参数" + id);
		ArticleDTO res = iArticleFunction.getContentById(id);
		RequestResult result = new RequestResult.Builder().code(100).msg("成功").data(res).build();
		return result;
	}




	private List<ArticleDTO> getContent (int type) {
		return iArticleFunction.getContent(type);
	}
}
