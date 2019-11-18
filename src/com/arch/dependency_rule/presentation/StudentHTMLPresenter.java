package com.arch.dependency_rule.presentation;

import com.arch.dependency_rule.application.StudentVerificationInterface;
import com.arch.dependency_rule.application.VerificationServiceFactory;
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
        VerificationServiceFactoryInterface verificationServiceFactory = new VerificationServiceFactory();
        StudentVerificationInterface verificationService = verificationServiceFactory.makeService(grade);

        if (verificationService.verifyId(student) && verificationService.verifyName(student))
            studentPersistance.save(student);
    }
}
