package com.example.appregistrostudentits.db.studentModuleVote.student_module_voteService;

import com.example.appregistrostudentits.db.studentModuleVote.StudentModuleVote;

import java.util.List;


public interface StudentModuleVoteService {
    StudentModuleVote createStudentModuleVote(StudentModuleVote studentModuleVote);
    StudentModuleVote getStudentModuleVote(Long id);
    List<StudentModuleVote> getAllStudentModuleVotes();
    StudentModuleVote updateStudentModuleVote(StudentModuleVote studentModuleVote);
    void deleteStudentModuleVote(Long id);
}
