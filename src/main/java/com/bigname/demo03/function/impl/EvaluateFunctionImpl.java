package com.bigname.demo03.function.impl;

import com.bigname.common.CoreToDtoUtil;
import com.bigname.demo03.core.Article;
import com.bigname.demo03.core.Evaluate;
import com.bigname.demo03.dao.ArticleDao;
import com.bigname.demo03.dao.EvaluateDao;
import com.bigname.demo03.dto.ArticleDTO;
import com.bigname.demo03.dto.EvaluateDTO;
import com.bigname.demo03.function.IArticleFunction;
import com.bigname.demo03.function.IEvaluateFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluateFunctionImpl implements IEvaluateFunction {

	@Autowired
	EvaluateDao aDao;


	public List<EvaluateDTO> getEvaluate(int articleId, int type) {
		List<Evaluate> evaluates = aDao.getEvaluate(articleId, type);
		return CoreToDtoUtil.evaluateList2EvaluateDTOList(evaluates);
	}

	public Integer setEvaluate(EvaluateDTO evaluateDTO) {
		Integer result = aDao.setEvaluate(evaluateDTO);
		return result;
	}


}
