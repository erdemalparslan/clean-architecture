package com.arch.dependency_rule.drivers;

import com.arch.dependency_rule.entity.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentPersistance {

    Map<String, Student> students = new HashMap<>();

    List<Student> studentList = new ArrayList<>();

    public Student getStudentFromMySql(String id){
        return students.get(id);
    }

    public void saveStudentToMySql(Student student){
        students.put(student.getId(), student);
    }

    public Student getStudentFromOracle(String id){
        Student student = null;
        for (Student st : studentList){
            if(st.getId().equals(id))
                student = st;
        }

        return student;
    }

    public void saveStudentToOracle(Student student){
        studentList.add(student);
    }
}
