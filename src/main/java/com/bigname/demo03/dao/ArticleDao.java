package com.bigname.demo03.dao;


import java.util.List;

import com.bigname.demo03.core.Article;
import com.bigname.demo03.dto.ArticleDTO;

public interface ArticleDao {
	// 获取热门文章
	List<Article> getHotArticles();

	// 根据id查询文章
	Article getArticleById(int id);
}
