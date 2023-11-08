package com.arjuncodes.studentsystem.service;

import com.arjuncodes.studentsystem.model.Student;
import com.arjuncodes.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudent(Integer studentID) {

        studentRepository.deleteById(studentID);

    }

    @Override
    public Optional<Student> findById(Integer studentID) {
        return studentRepository.findById(studentID);
    }

    @Override
    public List<Student> findByName(String studentName) {
        return studentRepository.findAllByName(studentName);
    }


}
