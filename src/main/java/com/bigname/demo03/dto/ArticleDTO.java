package com.bigname.demo03.dto;

import com.bigname.demo03.core.Evaluate;

import java.sql.Date;
import java.util.List;

public class ArticleDTO {
	private int id;
	private String title;
	private String desc;
	private String content;
	private String date;
	private String tab;
	private String author;
	private String img;
	private String evaluateId;
	private String type;
	private List<EvaluateDTO> evaluateDTOList;

	public ArticleDTO() {
	}

	public ArticleDTO(String title, String desc, String content, String date, String tab, String author, String img, String evaluateId, String type) {

		this.title = title;
		this.desc = desc;
		this.content = content;
		this.date = date;
		this.tab = tab;
		this.author = author;
		this.img = img;
		this.evaluateId = evaluateId;
		this.type = type;
	}

	public ArticleDTO(int id, String title, String desc, String content, String date, String tab, String author, String img, String evaluateId, String type) {
		this.id = id;
		this.title = title;
		this.desc = desc;
		this.content = content;
		this.date = date;
		this.tab = tab;
		this.author = author;
		this.img = img;
		this.evaluateId = evaluateId;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTab() {
		return tab;
	}

	public void setTab(String tab) {
		this.tab = tab;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getEvaluateId() {
		return evaluateId;
	}

	public void setEvaluateId(String evaluateId) {
		this.evaluateId = evaluateId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArticleDTO(int id, String title, String desc, String content, String date, String tab, String author, String img, String evaluateId, String type, List<EvaluateDTO> evaluateDTOList) {
		this.id = id;
		this.title = title;
		this.desc = desc;
		this.content = content;
		this.date = date;
		this.tab = tab;
		this.author = author;
		this.img = img;
		this.evaluateId = evaluateId;
		this.type = type;
		this.evaluateDTOList = evaluateDTOList;
	}

	public List<EvaluateDTO> getEvaluateDTOList() {
		return evaluateDTOList;
	}

	public void setEvaluateDTOList(List<EvaluateDTO> evaluateDTOList) {
		this.evaluateDTOList = evaluateDTOList;
	}

	@Override
	public String toString() {
		return "ArticleDTO{" +
				"id=" + id +
				", title='" + title + '\'' +
				", desc='" + desc + '\'' +
				", content='" + content + '\'' +
				", date=" + date +
				", tab='" + tab + '\'' +
				", author='" + author + '\'' +
				", img='" + img + '\'' +
				", evaluateId='" + evaluateId + '\'' +
				", type='" + type + '\'' +
				", evaluateDTOList=" + evaluateDTOList +
				'}';
	}
}
