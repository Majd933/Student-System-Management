package com.myweb.studentManagementSystem.service;

import com.myweb.studentManagementSystem.entity.Student;
import com.myweb.studentManagementSystem.repositroy.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    StudentRepo repo;


    @Override
    public List<Student> getAllStudents() {

        return repo.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repo.save(student);
    }

    @Override
    public Student getStudentByID(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return repo.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }

}
