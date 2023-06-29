package com.example.appregistrostudentits.db.courseTable.courseService;

import com.example.appregistrostudentits.db.courseTable.CourseTable;
import com.example.appregistrostudentits.db.moduleTable.ModuleTable;

import java.util.List;


public interface CourseService {
    CourseTable createCourse(CourseTable course);
    CourseTable getCourse(Long id);
    List<CourseTable> getAllCourses();
    public List<ModuleTable> getModulesByCourse(Long idCourse);
    CourseTable updateCourse(CourseTable course);
    void deleteCourse(Long id);
}
