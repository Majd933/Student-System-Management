package com.myweb.studentManagementSystem.controller;

import com.myweb.studentManagementSystem.entity.Student;
import com.myweb.studentManagementSystem.service.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    StudentServiceImp studentServiceImp;



    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students",studentServiceImp.getAllStudents());
        System.out.println(studentServiceImp.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model){

        //Create  Student object to hold student from Data
        Student student = new Student();

        model.addAttribute("student",student);
        return "create_student";
    }


    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentServiceImp.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudent(@PathVariable Long id ,Model model){
        model.addAttribute("student",studentServiceImp.getStudentByID(id));
        return "editStudent";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
                                @ModelAttribute("student") Student student,
        Model model){

        // get Student form Database by Id
        Student exisitingStudent=studentServiceImp.getStudentByID(id);
        exisitingStudent.setId(student.getId());
        exisitingStudent.setFirstName(student.getFirstName());
        exisitingStudent.setLastName(student.getLastName());
        exisitingStudent.setEmail(student.getEmail());

        // save Update student object
        studentServiceImp.saveStudent(exisitingStudent);

        return "redirect:/students";
    }

    // hander method to handle delete Student request
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentServiceImp.deleteStudent(id);
        return  "redirect:/students";
    }


}
