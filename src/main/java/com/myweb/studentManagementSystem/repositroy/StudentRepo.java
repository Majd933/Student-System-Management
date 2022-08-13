package com.myweb.studentManagementSystem.repositroy;

import com.myweb.studentManagementSystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {

}
