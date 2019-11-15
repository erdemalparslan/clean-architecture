package com.arch.dependency_rule.presentation;

import com.arch.dependency_rule.drivers.StudentPersistance;
import com.arch.dependency_rule.entity.Student;

public class StudentHTMLPresenter {
    public String viewStudentDetails(String id, StudentPersistance studentPersistance){
        Student student = studentPersistance.getStudentFromArrayList(id);
        return  "<html><body>" +
                "{" +
                "id='" + id + '\'' +
                ", name='" + student.getName() + '\'' +
                ", enrolledDate=" + student.getEnrolledDate() +
                ", grade=" + student.getGrade() +
                '}' +
                "</html></body>";
    }
}
