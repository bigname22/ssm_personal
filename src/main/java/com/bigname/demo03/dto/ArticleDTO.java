package com.bigname.demo03.dto;

import java.sql.Date;

public class ArticleDTO {
	private int id;
	// 文章标题
	private String title;
	// 文章描述
	private String desc;
	// 文章内容
	private String content;
	// 文章日期
	private Date date;
	// 文章标签
	private String  tab;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTab() {
		return tab;
	}
	public void setTab(String tab) {
		this.tab = tab;
	}
	public ArticleDTO(int id, String title, String desc, String content,
			Date date, String tab) {
		super();
		this.id = id;
		this.title = title;
		this.desc = desc;
		this.content = content;
		this.date = date;
		this.tab = tab;
	}
	public ArticleDTO() {
		super();
	}
	@Override
	public String toString() {
		return "ArticleDTO [id=" + id + ", title=" + title + ", desc=" + desc
				+ ", content=" + content + ", date=" + date + ", tab=" + tab
				+ "]";
	}
	
}
