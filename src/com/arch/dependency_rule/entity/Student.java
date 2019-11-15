package com.arch.dependency_rule.entity;

import java.util.*;

public class Student {

    private String id;
    private String name;
    private Date enrolledDate;
    private int grade;

    public Student(String id, String name, Date enrolledDate, int grade) {
        this.id = id;
        this.name = name;
        this.enrolledDate = enrolledDate;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnrolledDate() {
        return enrolledDate;
    }

    public void setEnrolledDate(Date enrolledDate) {
        this.enrolledDate = enrolledDate;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }




}
