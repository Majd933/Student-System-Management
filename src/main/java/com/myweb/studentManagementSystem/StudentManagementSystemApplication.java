package com.myweb.studentManagementSystem;

import com.myweb.studentManagementSystem.entity.Student;
import com.myweb.studentManagementSystem.repositroy.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }


    @Autowired
    private StudentRepo repo;

    @Override
    public void run(String... args) throws Exception {
      /*  Student student1 = new Student("Majd","alk","mk@gmail.com");
        repo.save(student1);

        Student student2 = new Student("ayh","alk","ay@gamil.com");
        repo.save(student2);

        Student student3 = new Student("mear","alk","me@gamil.com");
        repo.save(student3);
    */}
}
