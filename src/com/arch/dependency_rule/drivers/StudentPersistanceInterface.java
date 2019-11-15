package com.arch.dependency_rule.drivers;

import com.arch.dependency_rule.entity.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StudentPersistanceInterface {
    Map<String, Student> students = new HashMap<>();
    List<Student> studentList = new ArrayList<>();

    public void save(Student student);
    public Student get(String id);
}
