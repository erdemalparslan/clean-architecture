package com.arch.dependency_rule.application;

import com.arch.dependency_rule.entity.Student;

public class StudentVerificationService {
    public boolean verify_grade_lte2(Student student){
        return student.getId().startsWith("A");
    }
    public boolean verify_grade_gt2(Student student){
        return student.getId().startsWith("Z");
    }
}
