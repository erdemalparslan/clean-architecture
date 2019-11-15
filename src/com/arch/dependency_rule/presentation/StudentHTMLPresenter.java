package com.arch.dependency_rule.presentation;

import com.arch.dependency_rule.entity.Student;

public class StudentHTMLPresenter {
    public String viewStudentDetails(String id){
        Student student = Student.getStudentFromHashTable(id);
        return  student.toString();
    }
}
