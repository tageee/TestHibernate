package com.hibernate.model;

/**
 * Created by tage on 3/19/16.
 */
public class Student {
    private int id;

    private StuIdCard stuIdCard;

    public StuIdCard getStuIdCard() {
        return stuIdCard;
    }

    public void setStuIdCard(StuIdCard stuIdCard) {
        this.stuIdCard = stuIdCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
}
