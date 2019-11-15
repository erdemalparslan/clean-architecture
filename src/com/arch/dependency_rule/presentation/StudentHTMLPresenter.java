package com.arch.dependency_rule.presentation;

import com.arch.dependency_rule.drivers.StudentPersistance;
import com.arch.dependency_rule.entity.Student;

public class StudentHTMLPresenter {
    public String viewStudentDetails(String id, int persistance_type, StudentPersistance studentPersistance){
        Student student = null;
        if(persistance_type==1){
            student = studentPersistance.getStudentFromArrayList(id);
        }
        else if(persistance_type==2){
            student = studentPersistance.getStudentFromHashTable(id);
        }

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
