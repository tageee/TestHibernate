package com.hibernate.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by tage on 3/16/16.
 */


@Entity
@Table(name="_Teacher")
public class Teacher {

    //@Id //也可以 根据get方法最好，保护封装， getTotalPrice 可以在表中
    private int id;
    private String name;
    private int age;
    private Title title;
    private String yourWifeName;
    private Date birthDate;

    @Temporal(TemporalType.DATE)
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Transient
    public String getYourWifeName() {
        return yourWifeName;
    }

    public void setYourWifeName(String yourWifeName) {
        this.yourWifeName = yourWifeName;
    }

    @Enumerated(EnumType.STRING)//EnumType.ORDINAL
    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    @Column(name = "_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic //默认
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
