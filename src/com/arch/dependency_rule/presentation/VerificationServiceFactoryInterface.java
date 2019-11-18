package com.arch.dependency_rule.presentation;

import com.arch.dependency_rule.application.StudentIdVerificationInterface;
import com.arch.dependency_rule.application.StudentNameVerificationInterface;

public interface VerificationServiceFactoryInterface {
    StudentIdVerificationInterface makeIdService(int grade);
    StudentNameVerificationInterface makeNameService();
}
