package com.bigname.demo03.function;

import java.util.List;

import com.bigname.demo03.dto.ArticleDTO;
import org.springframework.stereotype.Service;

@Service
public interface IArticleFunction {
	
	// 获取热门文章
	List<ArticleDTO> getHotArticles();

	// 根据id查询文章
	ArticleDTO getArticleById(int id);
}
