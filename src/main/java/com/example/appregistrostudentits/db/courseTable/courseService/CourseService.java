package com.example.appregistrostudentits.db.courseTable.courseService;

import com.example.appregistrostudentits.db.courseTable.CourseTable;

import java.util.List;


public interface CourseService {
    CourseTable createCourse(CourseTable course);
    CourseTable getCourse(Long id);
    List<CourseTable> getAllCourses();
    CourseTable updateCourse(CourseTable course);
    void deleteCourse(Long id);
}
