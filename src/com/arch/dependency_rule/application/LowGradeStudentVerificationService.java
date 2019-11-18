package com.arch.dependency_rule.application;

import com.arch.dependency_rule.entity.Student;

public class LowGradeStudentVerificationService implements StudentIdVerificationInterface{
    @Override
    public boolean verifyId(Student student) {
        return student.getId().startsWith("A");
    }

}
