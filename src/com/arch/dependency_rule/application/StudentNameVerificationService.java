package com.arch.dependency_rule.application;

import com.arch.dependency_rule.entity.Student;

public class StudentNameVerificationService implements StudentNameVerificationInterface {
    @Override
    public boolean verifyName(Student student) {
        return student.getName().length()>=3;
    }
}
