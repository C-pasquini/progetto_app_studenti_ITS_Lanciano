package com.example.appregistrostudentits.db.courseTable.course_service;

import com.example.appregistrostudentits.db.courseTable.CourseTable;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CourseService {
    CourseTable createCourse(CourseTable course);
    CourseTable getCourse(Long id);
    List<CourseTable> getAllCourses();
    CourseTable updateCourse(CourseTable course);
    void deleteCourse(Long id);
}
