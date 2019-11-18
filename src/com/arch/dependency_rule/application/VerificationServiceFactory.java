package com.arch.dependency_rule.application;

import com.arch.dependency_rule.presentation.VerificationServiceFactoryInterface;

public class VerificationServiceFactory implements VerificationServiceFactoryInterface {

    @Override
    public StudentIdVerificationInterface makeIdService(int grade) {
        if(grade<=2)
            return new LowGradeStudentVerificationService();
        else
            return new HighGradeStudentVerificationService();
    }

    @Override
    public StudentNameVerificationInterface makeNameService() {
        return new StudentNameVerificationService();
    }
}
