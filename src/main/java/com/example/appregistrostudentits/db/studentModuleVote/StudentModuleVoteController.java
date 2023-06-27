package com.example.appregistrostudentits.db.studentModuleVote;

import com.example.appregistrostudentits.db.studentModuleVote.StudentModuleVote;
import com.example.appregistrostudentits.db.studentModuleVote.student_module_voteService.StudentModuleVoteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class StudentModuleVoteController {
    private final StudentModuleVoteService studentModuleVoteService;

    public StudentModuleVoteController(StudentModuleVoteService studentModuleVoteService) {
        this.studentModuleVoteService = studentModuleVoteService;
    }

    @GetMapping("/studentModuleVotes")
    public List<StudentModuleVote> getAllStudentModuleVotes() {
        return studentModuleVoteService.getAllStudentModuleVotes();
    }

    @GetMapping("/studentModuleVotes/{id}")
    public StudentModuleVote getStudentModuleVote(@PathVariable Long id){
        return studentModuleVoteService.getStudentModuleVote(id);
    }

    @PostMapping("/studentModuleVotes")
    public StudentModuleVote createStudentModuleVote(@RequestBody StudentModuleVote studentModuleVote){
        return studentModuleVoteService.createStudentModuleVote(studentModuleVote);
    }

    @PutMapping("/studentModuleVotes/{id}")
    public StudentModuleVote updateStudentModuleVote(@PathVariable Long id, @RequestBody StudentModuleVote studentModuleVote){
        if(!id.equals(studentModuleVote.getIdVoto())){
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "Id in path does not match Id in StudentModuleVote object");
        }
        return studentModuleVoteService.updateStudentModuleVote(studentModuleVote);
    }

    @DeleteMapping("/studentModuleVotes/{id}")
    public void deleteStudentModuleVote(@PathVariable Long id) {
        studentModuleVoteService.deleteStudentModuleVote(id);
    }
}
