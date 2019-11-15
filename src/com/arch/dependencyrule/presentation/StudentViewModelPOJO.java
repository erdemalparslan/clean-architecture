package com.arch.dependencyrule.presentation;

import java.util.Date;

public class StudentViewModelPOJO {

    private String name;
    private Date enrolledDate;
    private int grade;

    @Override
    public String toString() {
        return "StudentViewModelPOJO{" +
                "name='" + name + '\'' +
                ", enrolledDate=" + enrolledDate +
                ", grade=" + grade +
                '}';
    }

    public StudentViewModelPOJO(String name, Date enrolledDate, int grade) {
        this.name = name;
        this.enrolledDate = enrolledDate;
        this.grade = grade;
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
