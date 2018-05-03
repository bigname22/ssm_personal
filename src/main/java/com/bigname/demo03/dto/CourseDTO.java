package com.bigname.demo03.dto;

import java.util.List;

public class CourseDTO {
    private int id;
    private String title;
    private String desc;
    private String level;
    private String learningNumber;
    private String img;
    private String tab;
    private List<ChapterDTO> chapterDTOList;

    public List<EvaluateDTO> getEvaluateDTOList() {
        return evaluateDTOList;
    }

    public void setEvaluateDTOList(List<EvaluateDTO> evaluateDTOList) {
        this.evaluateDTOList = evaluateDTOList;
    }

    public CourseDTO(String title, String desc, String level, String learningNumber, String img, String tab, List<ChapterDTO> chapterDTOList, List<EvaluateDTO> evaluateDTOList, double price, int purchaseNumber) {

        this.title = title;
        this.desc = desc;
        this.level = level;
        this.learningNumber = learningNumber;
        this.img = img;
        this.tab = tab;
        this.chapterDTOList = chapterDTOList;
        this.evaluateDTOList = evaluateDTOList;
        this.price = price;
        this.purchaseNumber = purchaseNumber;
    }

    public CourseDTO(int id, String title, String desc, String level, String learningNumber, String img, String tab, List<ChapterDTO> chapterDTOList, List<EvaluateDTO> evaluateDTOList, double price, int purchaseNumber) {

        this.id = id;
        this.title = title;
        this.desc = desc;
        this.level = level;
        this.learningNumber = learningNumber;
        this.img = img;
        this.tab = tab;
        this.chapterDTOList = chapterDTOList;
        this.evaluateDTOList = evaluateDTOList;
        this.price = price;
        this.purchaseNumber = purchaseNumber;
    }

    private List<EvaluateDTO> evaluateDTOList;

    public CourseDTO(int id, String title, String desc, String level, String learningNumber, String img, String tab, double price, int purchaseNumber) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.level = level;
        this.learningNumber = learningNumber;
        this.img = img;
        this.tab = tab;
        this.price = price;
        this.purchaseNumber = purchaseNumber;
    }

    private double price;
    private int purchaseNumber;


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPurchaseNumber() {
        return purchaseNumber;
    }

    public void setPurchaseNumber(int purchaseNumber) {
        this.purchaseNumber = purchaseNumber;
    }

    public CourseDTO(int id, String title, String desc, String level, String learningNumber, String img, String tab, List<ChapterDTO> chapterDTOList, double price, int purchaseNumber) {

        this.id = id;
        this.title = title;
        this.desc = desc;
        this.level = level;
        this.learningNumber = learningNumber;
        this.img = img;
        this.tab = tab;
        this.chapterDTOList = chapterDTOList;
        this.price = price;
        this.purchaseNumber = purchaseNumber;
    }

    public List<ChapterDTO> getChapterDTOList() {
        return chapterDTOList;
    }

    public void setChapterDTOList(List<ChapterDTO> chapterDTOList) {
        this.chapterDTOList = chapterDTOList;
    }

    public CourseDTO(int id, String title, String desc, String level, String learningNumber, String img, String tab, List<ChapterDTO> chapterDTOList) {

        this.id = id;
        this.title = title;
        this.desc = desc;
        this.level = level;
        this.learningNumber = learningNumber;
        this.img = img;
        this.tab = tab;
        this.chapterDTOList = chapterDTOList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +

                ", level='" + level + '\'' +
                ", learningNumber='" + learningNumber + '\'' +
                ", img='" + img + '\'' +
                ", tab='" + tab + '\'' +
                '}';
    }

    public CourseDTO() {
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLearningNumber() {
        return learningNumber;
    }

    public void setLearningNumber(String learningNumber) {
        this.learningNumber = learningNumber;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab;
    }

    public CourseDTO(String title, String desc, String level, String learningNumber, String img, String tab) {

        this.title = title;
        this.desc = desc;
        this.level = level;
        this.learningNumber = learningNumber;
        this.img = img;
        this.tab = tab;
    }

    public CourseDTO(int id, String title, String desc, String level, String learningNumber, String img, String tab) {

        this.id = id;
        this.title = title;
        this.desc = desc;
        this.level = level;
        this.learningNumber = learningNumber;
        this.img = img;
        this.tab = tab;
    }
}
