package com.arch.dependencyrule.application;

import com.arch.dependencyrule.presentation.StudentViewModelPOJO;

public interface OutputBoundary {

    StudentViewModelPOJO presentStudent(StudentOutputPOJO pojo);
}
