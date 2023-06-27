package com.example.appregistrostudentits.db.studentModuleVote;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentModuleVoteRepository extends JpaRepository<StudentModuleVote, Long> {
}
