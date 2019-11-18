package com.arch.dependency_rule.application;

import com.arch.dependency_rule.entity.Student;

public interface StudentNameVerificationInterface extends StudentVerificationInterface{

    boolean verifyName(Student student);
}
