package com.example.appregistrostudentits.db.studentModuleVote.student_module_voteService;

import com.example.appregistrostudentits.db.studentModuleVote.StudentModuleVoteRepository;
import com.example.appregistrostudentits.db.studentModuleVote.StudentModuleVote;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentModuleVoteServiceImpl implements StudentModuleVoteService {
    private final StudentModuleVoteRepository studentModelVoteRepository;

    public StudentModuleVoteServiceImpl(StudentModuleVoteRepository studentModelVoteRepository) {
        this.studentModelVoteRepository = studentModelVoteRepository;
    }

    @Override
    public StudentModuleVote createStudentModuleVote(StudentModuleVote studentModelVote) {
        return studentModelVoteRepository.save(studentModelVote);
    }

    @Override
    public StudentModuleVote getStudentModuleVote(Long id) {
        return studentModelVoteRepository.findById(id).orElseThrow();
    }

    @Override
    public List<StudentModuleVote> getAllStudentModuleVotes() {
        return studentModelVoteRepository.findAll();
    }

    @Override
    public StudentModuleVote updateStudentModuleVote(StudentModuleVote studentModelVote) {
        return studentModelVoteRepository.save(studentModelVote);
    }

    @Override
    public void deleteStudentModuleVote(Long id) {
        studentModelVoteRepository.deleteById(id);
    }
}
