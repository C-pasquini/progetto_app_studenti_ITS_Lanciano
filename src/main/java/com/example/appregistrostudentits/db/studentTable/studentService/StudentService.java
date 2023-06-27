package com.example.appregistrostudentits.db.studentTable.studentService;

import com.example.appregistrostudentits.db.studentTable.StudentTable;

import java.util.List;


public interface StudentService {
    StudentTable createStudent(StudentTable student);
    StudentTable getStudent(Long id);
    List<StudentTable> getAllStudents();
    StudentTable updateStudent(StudentTable student);
    void deleteStudent(Long id);
}
