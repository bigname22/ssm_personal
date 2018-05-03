package com.bigname.demo03.dao;


import java.util.List;

import com.bigname.demo03.core.Article;
import com.bigname.demo03.dto.ArticleDTO;
import org.apache.ibatis.annotations.Param;

public interface ArticleDao {
	// 获取内容
	List<Article> getContent(@Param("type") int type);

	// 设置内容
    Integer setContent(@Param("articledto") ArticleDTO articleDTO);

     // 获取内容 通过id查找
	Article getContentById(@Param("id") int id);
}
