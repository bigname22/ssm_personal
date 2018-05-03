package com.bigname.demo03.function;

import com.bigname.demo03.dao.EvaluateDao;
import com.bigname.demo03.dto.ArticleDTO;
import com.bigname.demo03.dto.EvaluateDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEvaluateFunction {
	
	// 获取评价
	List<EvaluateDTO> getEvaluate(int articleId, int type);

	// 添加评价
	Integer setEvaluate(EvaluateDTO evaluateDTO);
}
