package com.arjuncodes.studentsystem.controller;

import com.arjuncodes.studentsystem.model.Student;
import com.arjuncodes.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";
    }

    @GetMapping("/findAll")
    public List<Student> list(){
        studentService.findAllStudents();

        return studentService.findAllStudents();

    }

    @GetMapping("/find/{id}")
    public Optional<Student> findById(@PathVariable("id") Integer id) {

        return studentService.findById(id);

    }

    @GetMapping("/{name}")
    @Query(value = "SELECT * FROM student WHERE name = :studentName", nativeQuery = true)
    public List<Student> findStudentByName(@PathVariable("name") String studentName) {
        studentService.findByName(studentName);

        return studentService.findByName(studentName);

    }


    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") Integer id) {
        studentService.deleteStudent(id);
        return "Student is deleted!";
    }
}
