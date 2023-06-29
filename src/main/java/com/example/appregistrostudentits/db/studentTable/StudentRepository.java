package com.example.appregistrostudentits.db.studentTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentTable, Long> {
    @Query("SELECT s.tassoAssenze FROM StudentTable s WHERE s.idStudente = ?1")
    public double getStudnetFreq(Long id);
}
