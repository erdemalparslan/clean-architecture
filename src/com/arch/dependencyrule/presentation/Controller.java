package com.arch.dependencyrule.presentation;

import com.arch.dependencyrule.application.InputBoundary;
import com.arch.dependencyrule.application.StudentInputPOJO;
import com.arch.dependencyrule.application.UseCaseInteractor;
import com.arch.dependencyrule.drivers.DataAccess;

public class Controller {

    InputBoundary inputBoundary = new UseCaseInteractor(new DataAccess(), new Presenter());

    public void enrollStudent(String id, String name, int grade){
        StudentInputPOJO studentInputPOJO = new StudentInputPOJO(id, name, grade);
        System.out.println(inputBoundary.saveAndPresentStudent(studentInputPOJO).toString());
    }


}
