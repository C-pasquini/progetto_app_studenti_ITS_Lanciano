package com.example.appregistrostudentits.db.courseTable.courseService;

import com.example.appregistrostudentits.db.courseTable.CourseRepository;
import com.example.appregistrostudentits.db.courseTable.CourseTable;
import com.example.appregistrostudentits.db.moduleTable.ModuleTable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public CourseTable createCourse(CourseTable course) {
        return courseRepository.save(course);
    }

    @Override
    public CourseTable getCourse(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }
    public List<ModuleTable> getModulesByCourse(Long idCourse){
        return courseRepository.getModulesByCourse(idCourse);
    }

    @Override
    public List<CourseTable> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public CourseTable updateCourse(CourseTable course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
