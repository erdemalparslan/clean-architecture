package com.arch.dependency_rule.drivers;

import com.arch.dependency_rule.entity.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentPersistance {

    Map<String, Student> students = new HashMap<>();

    List<Student> studentList = new ArrayList<>();

    public Student getStudentFromHashTable(String id){
        return students.get(id);
    }

    public void saveStudentToHashTable(Student student){
        students.put(student.getId(), student);
    }

    public Student getStudentFromArrayList(String id){
        Student student = null;
        for (Student st : studentList){
            if(st.getId().equals(id))
                student = st;
        }

        return student;
    }

    public void saveStudentToArrayList(Student student){
        studentList.add(student);
    }
}
