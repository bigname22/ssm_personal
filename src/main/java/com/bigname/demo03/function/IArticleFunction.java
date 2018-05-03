package com.bigname.demo03.function;

import java.util.List;

import com.bigname.demo03.dto.ArticleDTO;
import org.springframework.stereotype.Service;

@Service
public interface IArticleFunction {
	
	// 获取内容
	List<ArticleDTO> getContent(int type);

	// 增加内容
	Integer setContent(ArticleDTO articleDTO);

	// 获取内容 通过id查找
	ArticleDTO getContentById(int id);
}
