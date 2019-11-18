package com.arch.dependency_rule.application;

import com.arch.dependency_rule.entity.Student;

public interface StudentIdVerificationInterface extends StudentVerificationInterface{

    boolean verifyId(Student student);
}
