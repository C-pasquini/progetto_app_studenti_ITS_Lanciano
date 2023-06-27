package com.example.appregistrostudentits.db.courseTable;

import com.example.appregistrostudentits.db.courseTable.course_service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public List<CourseTable> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/courses/{id}")
    public CourseTable getCourse(@PathVariable Long id){
        return courseService.getCourse(id);
    }

    @PostMapping("/courses")
    public CourseTable createCourse(@RequestBody CourseTable course){
        return courseService.createCourse(course);
    }

    @PutMapping("/courses/{id}")
    public CourseTable updateCourse(@PathVariable Long id, @RequestBody CourseTable course){
        if(!id.equals(course.getIdCorso())){
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "Id in path does not match Id in Course object");
        }
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }
}
