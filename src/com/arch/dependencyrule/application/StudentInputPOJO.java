package com.arch.dependencyrule.application;

public class StudentInputPOJO {

    public StudentInputPOJO(String id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    private String id;
    private String name;
    private int grade;

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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
