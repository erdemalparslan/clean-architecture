package com.arch.dependency_rule.application;

import com.arch.dependency_rule.entity.Student;

public class LowGradeStudentVerificationService implements StudentVerificationInterface{
    @Override
    public boolean verifyId(Student student) {
        return student.getId().startsWith("A");
    }

    @Override
    public boolean verifyName(Student student) {
        return student.getName().length()>=3;
    }
}
