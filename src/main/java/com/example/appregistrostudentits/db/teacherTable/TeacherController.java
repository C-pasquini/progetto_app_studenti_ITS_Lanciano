package com.example.appregistrostudentits.db.teacherTable;

import com.example.appregistrostudentits.db.teacherTable.TeacherTable;
import com.example.appregistrostudentits.db.teacherTable.teacherService.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/teachers")
    public List<TeacherTable> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @GetMapping("/teachers/{id}")
    public TeacherTable getTeacher(@PathVariable Long id){
        return teacherService.getTeacher(id);
    }

    @PostMapping("/teachers")
    public TeacherTable createTeacher(@RequestBody TeacherTable teacher){
        return teacherService.createTeacher(teacher);
    }

    @PutMapping("/teachers/{id}")
    public TeacherTable updateTeacher(@PathVariable Long id, @RequestBody TeacherTable teacher){
        if(!id.equals(teacher.getIdDocente())){
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "Id in path does not match Id in Teacher object");
        }
        return teacherService.updateTeacher(teacher);
    }

    @DeleteMapping("/teachers/{id}")
    public void deleteTeacher(@PathVariable Long id) {
        teacherService.deleteTeacher(id);
    }
}
