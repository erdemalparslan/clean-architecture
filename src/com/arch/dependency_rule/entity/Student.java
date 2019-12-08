package com.arch.dependency_rule.entity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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

    static Map<String, Student> students = new HashMap<>();

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

    public static Student getStudentFromMySql(String id){
        return students.get(id);
    }

    public static void saveStudentToMySql(Student student){
        students.put(student.id, student);
    }


}
