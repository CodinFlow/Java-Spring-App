package com.arjuncodes.studentsystem.service;

import com.arjuncodes.studentsystem.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public void saveStudent(Student student);
    public List<Student> findAllStudents();

    public void deleteStudent(Integer studentID);


    public Optional<Student> findById(Integer studentID);

    public List<Student> findByName(String name);


}
