package com.arch.dependencyrule.application;

import com.arch.dependencyrule.drivers.DataAccess;
import com.arch.dependencyrule.entity.Student;
import com.arch.dependencyrule.presentation.Presenter;
import com.arch.dependencyrule.presentation.StudentViewModelPOJO;

import java.util.Date;

public class UseCaseInteractor implements InputBoundary{

    DataAccessInterface dataAccessInterface;
    OutputBoundary outputBoundary;

    public UseCaseInteractor(DataAccessInterface dataAccessInterface, OutputBoundary outputBoundary) {
        this.dataAccessInterface = dataAccessInterface;
        this.outputBoundary = outputBoundary;
    }

    @Override
    public StudentViewModelPOJO saveAndPresentStudent(StudentInputPOJO pojo) {
        Student student = new Student(pojo.getId(), pojo.getName(), new Date(), pojo.getGrade());
        dataAccessInterface.writeStudent(student);
        return outputBoundary.presentStudent(new StudentOutputPOJO(student.getId(), student.getName(), student.getEnrolledDate(), student.getGrade()));
    }

}
