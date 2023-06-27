package com.example.appregistrostudentits.db.teacherTable.teacherService;

import com.example.appregistrostudentits.db.teacherTable.TeacherTable;

import java.util.List;


public interface TeacherService {
    TeacherTable createTeacher(TeacherTable teacher);
    TeacherTable getTeacher(Long id);
    List<TeacherTable> getAllTeachers();
    TeacherTable updateTeacher(TeacherTable teacher);
    void deleteTeacher(Long id);
}
