package com.bigname.common;

import java.util.ArrayList;
import java.util.List;

import com.bigname.demo03.core.Article;
import com.bigname.demo03.core.Member;
import com.bigname.demo03.dto.ArticleDTO;
import com.bigname.demo03.dto.MemberDTO;

public class CoreToDtoUtil {
	public static MemberDTO member2MemberDTO (Member member) {
		if (member == null) {
			return null;
		}
		MemberDTO dto = new MemberDTO(member.getId(),member.getName(),member.getPassword());
		return dto;
	}
	
	public static ArticleDTO article2ArticleDTO (Article article) {
		if(article == null) {
			return null;
		}
		ArticleDTO dto = new ArticleDTO(
				article.getId(),
				article.getTitle(),
				article.getDesc(),
				article.getContent(),
				article.getDate(),
				article.getTab()
				);
		return dto;
	}
	
	public static List<ArticleDTO> articleList2ArticleDTOList (List<Article> aList) {
		List<ArticleDTO> aDTOList = new ArrayList<ArticleDTO>();
		if(aList == null) {
			return aDTOList;
		}
		for(int i=0;i<aList.size();i++){
			Article tempA = aList.get(i);
			ArticleDTO aDTO = article2ArticleDTO(tempA);
			aDTOList.add(aDTO);
		}
		return aDTOList;
	}
}
