package com.arch.dependency_rule.drivers;

import com.arch.dependency_rule.entity.Student;

public class StudentOraclePersistance implements StudentPersistanceInterface {
    @Override
    public void save(Student student) {
        studentList.add(student);
    }

    @Override
    public Student get(String id) {
        Student student = null;
        for (Student st : studentList){
            if(st.getId().equals(id))
                student = st;
        }

        return student;
    }
}
