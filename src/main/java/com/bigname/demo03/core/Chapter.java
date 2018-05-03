package com.bigname.demo03.core;

public class Chapter {
    private int id;
    private String title;
    private int index;
    private String playUrl;
    private int courseId;
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Chapter(int id, String title, int index, String playUrl, int courseId, String time) {

        this.id = id;
        this.title = title;
        this.index = index;
        this.playUrl = playUrl;
        this.courseId = courseId;
        this.time = time;
    }

    @Override
    public String toString() {

        return "Chapter{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", index=" + index +
                ", playUrl='" + playUrl + '\'' +
                ", courseId=" + courseId +
                ", courseId=" + courseId +
                '}';
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

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Chapter() {

    }

    public Chapter(String title, int index, String playUrl, int courseId) {

        this.title = title;
        this.index = index;
        this.playUrl = playUrl;
        this.courseId = courseId;
    }

    public Chapter(int id, String title, int index, String playUrl, int courseId) {

        this.id = id;
        this.title = title;
        this.index = index;
        this.playUrl = playUrl;
        this.courseId = courseId;
    }
}
