package com.example.appregistrostudentits.db.timeTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeTableRepository extends JpaRepository<TimeTable, Long> {
}
