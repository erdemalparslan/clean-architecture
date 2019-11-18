package com.arch.dependency_rule.application;

import com.arch.dependency_rule.entity.Student;

public interface StudentVerificationInterface {

    boolean verifyId(Student student);
    boolean verifyName(Student student);
}
