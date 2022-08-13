package com.myweb.studentManagementSystem.service;


import com.myweb.studentManagementSystem.entity.Student;

import java.util.List;


public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentByID(Long id);

    Student updateStudent(Student student);

    void deleteStudent(Long id);

}
