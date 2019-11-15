package com.arch.dependencyrule.presentation;

import com.arch.dependencyrule.application.OutputBoundary;
import com.arch.dependencyrule.application.StudentOutputPOJO;

public class Presenter implements OutputBoundary {
    @Override
    public StudentViewModelPOJO presentStudent(StudentOutputPOJO outputPOJO) {
        return new StudentViewModelPOJO(outputPOJO.getName(), outputPOJO.getEnrolledDate(), outputPOJO.getGrade());
    }
}
