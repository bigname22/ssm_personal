package com.bigname.demo03.dao;


import com.bigname.demo03.core.Article;
import com.bigname.demo03.core.Evaluate;
import com.bigname.demo03.dto.EvaluateDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EvaluateDao {
	// 获取评价
	List<Evaluate> getEvaluate(@Param("articleId") int articleId,@Param("type") int type);

	// 添加评价
	Integer setEvaluate(@Param("evaluatedto") EvaluateDTO evaluatedto);
}
