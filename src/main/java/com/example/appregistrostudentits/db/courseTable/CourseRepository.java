package com.example.appregistrostudentits.db.courseTable;

import com.example.appregistrostudentits.db.moduleTable.ModuleTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<CourseTable, Long> {
    @Query("SELECT m FROM ModuleTable m WHERE m.idCorso = ?1")
    public List<ModuleTable> getModulesByCourse(Long idCourse);
}
