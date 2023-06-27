package com.example.appregistrostudentits.db.studentTable.studentService;

import com.example.appregistrostudentits.db.studentTable.StudentRepository;
import com.example.appregistrostudentits.db.studentTable.StudentTable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentTable createStudent(StudentTable student) {
        return studentRepository.save(student);
    }

    @Override
    public StudentTable getStudent(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public List<StudentTable> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public StudentTable updateStudent(StudentTable student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
