package com.arch;

import com.arch.dependency_rule.drivers.StudentPersistance;
import com.arch.dependency_rule.entity.Student;
import com.arch.dependency_rule.presentation.StudentHTMLPresenter;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        StudentPersistance studentPersistance = new StudentPersistance();
        studentPersistance.saveStudentToArrayList(new Student("A123", "John", new Date(), 3));
        StudentHTMLPresenter presenter = new StudentHTMLPresenter();
        System.out.println(presenter.viewStudentDetails("A123", studentPersistance));
    }
}
