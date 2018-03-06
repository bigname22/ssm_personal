package com.bigname.demo03.function.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bigname.common.CoreToDtoUtil;
import com.bigname.demo03.core.Article;
import com.bigname.demo03.dao.ArticleDao;
import com.bigname.demo03.dto.ArticleDTO;
import com.bigname.demo03.function.IArticleFunction;
import org.springframework.stereotype.Service;

@Service
public class ArticleFunctionImpl implements  IArticleFunction{

	@Autowired
	ArticleDao aDao;


	/* 获取热门文章 */
	public List<ArticleDTO> getHotArticles() {
		List<Article> aList = aDao.getHotArticles();
		return CoreToDtoUtil.articleList2ArticleDTOList(aList);
	}

	/* 根据id获取文章 */
	public ArticleDTO getArticleById(int id) {
		ArticleDTO aDto = CoreToDtoUtil.article2ArticleDTO(this.aDao.getArticleById(id));
		return aDto;
	}

}
