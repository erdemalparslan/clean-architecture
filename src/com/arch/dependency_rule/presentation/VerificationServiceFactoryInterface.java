package com.arch.dependency_rule.presentation;

import com.arch.dependency_rule.application.StudentVerificationInterface;
import com.arch.dependency_rule.entity.Student;

public interface VerificationServiceFactoryInterface {
    StudentVerificationInterface makeService(int grade);
}
