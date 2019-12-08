package com.arch;

import com.arch.dependency_rule.drivers.StudentOraclePersistance;
import com.arch.dependency_rule.drivers.StudentPersistanceInterface;
import com.arch.dependency_rule.presentation.StudentHTMLPresenter;


public class Main {

    public static void main(String[] args) {
        StudentPersistanceInterface studentPersistance = new StudentOraclePersistance();
        StudentHTMLPresenter presenter = new StudentHTMLPresenter();
        presenter.createStudent("A123", "John", 1, studentPersistance);
        System.out.println(presenter.viewStudentDetails("A123", studentPersistance));
    }
}
