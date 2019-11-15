package com.arch.dependencyrule.drivers;

import com.arch.dependencyrule.application.DataAccessInterface;
import com.arch.dependencyrule.entity.Student;

import java.util.HashMap;
import java.util.Map;

public class DataAccess implements DataAccessInterface {

    Map<String, Student> students = new HashMap<>();

    @Override
    public void writeStudent(Student student) {
        students.put(student.getId(), student);

    }

    @Override
    public Student readStudent(String id) {
        return students.get(id);
    }
}
