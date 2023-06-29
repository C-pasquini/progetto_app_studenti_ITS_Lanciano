package com.example.appregistrostudentits.db.timeTable.TimeTableService;

import com.example.appregistrostudentits.db.timeTable.TimeTable;

import java.util.List;
import java.util.Optional;


public interface TimeTableService {
    public TimeTable createTimeTable(TimeTable timeTable);
    public Optional<TimeTable> getTimeTable(Long id);
    public List<TimeTable> getAllTimeTables();
    public TimeTable updateTimeTable(TimeTable timeTable);
    public void deleteTimeTable(Long id);
}
