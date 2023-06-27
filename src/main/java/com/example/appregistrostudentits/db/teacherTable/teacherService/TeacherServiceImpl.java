package com.example.appregistrostudentits.db.teacherTable.teacherService;

import com.example.appregistrostudentits.db.teacherTable.TeacherRepository;
import com.example.appregistrostudentits.db.teacherTable.TeacherTable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public TeacherTable createTeacher(TeacherTable teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public TeacherTable getTeacher(Long id) {
        return teacherRepository.findById(id).orElseThrow();
    }

    @Override
    public List<TeacherTable> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public TeacherTable updateTeacher(TeacherTable teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }
}
