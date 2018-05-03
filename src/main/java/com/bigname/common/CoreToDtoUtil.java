package com.bigname.common;

import java.util.ArrayList;
import java.util.List;

import com.bigname.demo03.core.*;
import com.bigname.demo03.dto.*;

public class CoreToDtoUtil {
	public static MemberDTO member2MemberDTO (Member member) {
		if (member == null) {
			return null;
		}
		MemberDTO dto = new MemberDTO(member.getId(),member.getName(),member.getPassword(),member.getRole(),member.getCourse(), member.getContent());
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
				article.getTab(),
				article.getAuthor(),
				article.getImg(),
				article.getEvaluateId(),
				article.getType()
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

	// evaluate
	public static EvaluateDTO evaluate2EvaluateDTO (Evaluate evaluate) {
		if(evaluate == null) {
			return null;
		}
		EvaluateDTO dto = new EvaluateDTO(
				evaluate.getId(),
				evaluate.getTitle(),
				evaluate.getDesc(),
				evaluate.getContent(),
				evaluate.getDate(),
				evaluate.getAuthor(),
				evaluate.getArticleId(),
				evaluate.getType()
		);
		return dto;
	}

	public static List<EvaluateDTO> evaluateList2EvaluateDTOList (List<Evaluate> aList) {
		List<EvaluateDTO> aDTOList = new ArrayList<EvaluateDTO>();
		if(aList == null) {
			return aDTOList;
		}
		for(int i=0;i<aList.size();i++){
			Evaluate tempA = aList.get(i);
			EvaluateDTO aDTO = evaluate2EvaluateDTO(tempA);
			aDTOList.add(aDTO);
		}
		return aDTOList;
	}

	// course
	public static CourseDTO course2CourseDTO (Course course) {
		if(course == null) {
			return null;
		}
		CourseDTO dto = new CourseDTO(
				course.getId(),
				course.getTitle(),
				course.getDesc(),
				course.getLevel(),
				course.getLearningNumber(),
				course.getImg(),
				course.getTab(),
				course.getPrice(),
				course.getPurchaseNumber()
		);
		return dto;
	}

	public static List<CourseDTO> courseList2CourseDTOList (List<Course> aList) {
		List<CourseDTO> aDTOList = new ArrayList<CourseDTO>();
		if(aList == null) {
			return aDTOList;
		}
		for(int i=0;i<aList.size();i++){
			Course tempA = aList.get(i);
			CourseDTO aDTO = course2CourseDTO(tempA);
			aDTOList.add(aDTO);
		}
		return aDTOList;
	}

    // chapter
    public static ChapterDTO chapter2ChapterDTO (Chapter chapter) {
        if(chapter == null) {
            return null;
        }
        ChapterDTO dto = new ChapterDTO(
                chapter.getId(),
                chapter.getTitle(),
                chapter.getIndex(),
                chapter.getPlayUrl(),
                chapter.getCourseId(),
				chapter.getTime()
        );
        return dto;
    }

    public static List<ChapterDTO> chapterList2ChapterDTOList (List<Chapter> aList) {
        List<ChapterDTO> aDTOList = new ArrayList<ChapterDTO>();
        if(aList == null) {
            return aDTOList;
        }
        for(int i=0;i<aList.size();i++){
            Chapter tempA = aList.get(i);
            ChapterDTO aDTO = chapter2ChapterDTO(tempA);
            aDTOList.add(aDTO);
        }
        return aDTOList;
    }
}
