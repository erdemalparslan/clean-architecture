package com.arch.dependencyrule.application;

import com.arch.dependencyrule.presentation.StudentViewModelPOJO;

public interface InputBoundary {
    StudentViewModelPOJO saveAndPresentStudent(StudentInputPOJO pojo);
}
