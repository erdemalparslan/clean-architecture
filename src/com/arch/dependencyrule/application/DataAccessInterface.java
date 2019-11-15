package com.arch.dependencyrule.application;

import com.arch.dependencyrule.entity.Student;

public interface DataAccessInterface {
    void writeStudent(Student student);
    Student readStudent(String id);
}
