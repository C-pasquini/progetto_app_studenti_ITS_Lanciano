package com.example.appregistrostudentits.db.moduleTable;

import com.example.appregistrostudentits.db.studentModuleVote.StudentModuleVote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuleRepository extends JpaRepository<ModuleTable, Long> {
    @Query("SELECT v FROM StudentModuleVote v WHERE v.idModulo = ?1")
    public List<StudentModuleVote> getVotesByModule(Long id);
}
