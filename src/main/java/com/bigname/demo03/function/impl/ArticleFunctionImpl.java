package com.bigname.demo03.function.impl;

import java.util.List;

import com.bigname.demo03.core.Evaluate;
import com.bigname.demo03.dao.EvaluateDao;
import com.bigname.demo03.dto.RequestResult;
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

	@Autowired
	EvaluateDao eDao;


	/* 获取内容 */
	public List<ArticleDTO> getContent(int type) {
		List<ArticleDTO> articleDTOS = CoreToDtoUtil.articleList2ArticleDTOList(aDao.getContent(type));
		for(ArticleDTO article : articleDTOS) {
			int articleId = article.getId();
			List<Evaluate> evaluate = eDao.getEvaluate(articleId, type);
			article.setEvaluateDTOList(CoreToDtoUtil.evaluateList2EvaluateDTOList(evaluate));
		}
		return articleDTOS;
	}

	public Integer setContent(ArticleDTO articleDTO) {
		Integer result = aDao.setContent(articleDTO);
		return result;
	}

	public ArticleDTO getContentById(int id) {
		ArticleDTO articleDTO = CoreToDtoUtil.article2ArticleDTO(aDao.getContentById(id));
		List<Evaluate> evaluate = eDao.getEvaluate(articleDTO.getId(), Integer.parseInt(articleDTO.getType()));
		articleDTO.setEvaluateDTOList(CoreToDtoUtil.evaluateList2EvaluateDTOList(evaluate));
		return articleDTO;
	}


}
