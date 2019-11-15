package com.arch.dependency_rule.presentation;

import com.arch.dependency_rule.application.StudentVerificationService;
import com.arch.dependency_rule.drivers.StudentPersistanceInterface;
import com.arch.dependency_rule.entity.Student;

import java.util.Date;

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

    public void createStudent(String id, String name, int grade, StudentPersistanceInterface studentPersistance){
        Student student = new Student(id, name, new Date(), grade);
        StudentVerificationService verificationService = new StudentVerificationService();
        if(grade<=2) {
            if (verificationService.verify_grade_lte2(student)) //business logic for lte2
                studentPersistance.save(student);
        }
        else{
            if(verificationService.verify_grade_gt2(student)) // business logic for gt
                studentPersistance.save(student);
        }

    }
}
