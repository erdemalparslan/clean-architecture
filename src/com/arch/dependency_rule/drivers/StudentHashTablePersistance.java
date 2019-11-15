package com.arch.dependency_rule.drivers;

import com.arch.dependency_rule.entity.Student;

public class StudentHashTablePersistance implements StudentPersistanceInterface {
    @Override
    public void save(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public Student get(String id) {
        return students.get(id);
    }
}
