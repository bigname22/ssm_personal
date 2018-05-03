package com.bigname.demo03.core;

import java.sql.Date;

/*
 * 	createBy: LiangSJ
 * 	desc: 内容：type 1文章2公告3资料4问答5留言6笔记
 * */

public class Article {

	public static final int TYPE_ARTICLE = 1;          // 文章
	public static final int TYPE_NOTICE = 2;           // 公告
	public static final int TYPE_DATA = 3;             // 资料
	public static final int TYPE_ISSUE = 4;            // 问答
	public static final int TYPE_MESSAGE_BOARD = 5;   // 留言板

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

	@Override
	public String toString() {
		return "Article{" +
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
				'}';
	}

	public Article() {
	}

	public Article(String title, String desc, String content, String date, String tab, String author, String img, String evaluateId, String type) {

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

	public Article(int id, String title, String desc, String content, String date, String tab, String author, String img, String evaluateId, String type) {
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
}
