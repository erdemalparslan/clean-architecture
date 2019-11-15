package com.arch.dependency_rule.presentation;

import com.arch.dependency_rule.drivers.StudentPersistanceInterface;
import com.arch.dependency_rule.entity.Student;

public class StudentHTMLPresenter {
    public String viewStudentDetails(String id, StudentPersistanceInterface studentPersistance){
        Student student = null;
        student = studentPersistance.get(id);

        if (student != null) {
            return  "<html><body>" +
                    "{" +
                    "id='" + id + '\'' +
                    ", name='" + student.getName() + '\'' +
                    ", enrolledDate=" + student.getEnrolledDate() +
                    ", grade=" + student.getGrade() +
                    '}' +
                    "</html></body>";
        }
        else
            return "";
    }
}
