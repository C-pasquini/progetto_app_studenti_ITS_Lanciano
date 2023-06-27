package com.example.appregistrostudentits.db.studentTable;


import com.example.appregistrostudentits.db.studentTable.studentService.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<StudentTable> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public StudentTable getStudent(@PathVariable Long id){
        return studentService.getStudent(id);
    }

    @PostMapping("/students")
    public StudentTable createStudent(@RequestBody StudentTable student){
        return studentService.createStudent(student);
    }

    @PutMapping("/students/{id}")
    public StudentTable updateStudent(@PathVariable Long id, @RequestBody StudentTable student){
        if(!id.equals(student.getIdStudente())){
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "Id in path does not match Id in Student object");
        }
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}
