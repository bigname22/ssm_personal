package com.bigname.demo03.core;

public class Evaluate {
    private int id;
    private String title;
    private String desc;
    private String content;
    private String date;
    private String author;
    private int articleId;
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Evaluate(String title, String desc, String content, String date, String author, int articleId, int type) {

        this.title = title;
        this.desc = desc;
        this.content = content;
        this.date = date;
        this.author = author;
        this.articleId = articleId;
        this.type = type;
    }

    public Evaluate(int id, String title, String desc, String content, String date, String author, int articleId, int type) {

        this.id = id;
        this.title = title;
        this.desc = desc;
        this.content = content;
        this.date = date;
        this.author = author;
        this.articleId = articleId;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Evaluate(int id, String title, String desc, String content, String date, String author, int articleId) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.content = content;
        this.date = date;
        this.author = author;
        this.articleId = articleId;
    }

    public Evaluate(String title, String desc, String content, String date, String author, int articleId) {

        this.title = title;
        this.desc = desc;
        this.content = content;
        this.date = date;
        this.author = author;
        this.articleId = articleId;
    }

    public int getArticleId() {

        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public Evaluate() {

    }
}
