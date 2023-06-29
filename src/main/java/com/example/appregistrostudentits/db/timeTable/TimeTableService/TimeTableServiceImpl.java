package com.example.appregistrostudentits.db.timeTable.TimeTableService;

import com.example.appregistrostudentits.db.timeTable.TimeTable;
import com.example.appregistrostudentits.db.timeTable.TimeTableRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TimeTableServiceImpl implements TimeTableService{

    private final TimeTableRepository timeTableRepository;

    public TimeTableServiceImpl(TimeTableRepository timeTableRepository) {
        this.timeTableRepository = timeTableRepository;
    }
    @Override
    public TimeTable createTimeTable(TimeTable timeTable){
        return timeTableRepository.save(timeTable);
    }
    @Override
    public Optional<TimeTable> getTimeTable(Long id){
        return timeTableRepository.findById(id);
    }
    @Override
    public List<TimeTable> getAllTimeTables(){
        return timeTableRepository.findAll();
    }
    @Override
    public TimeTable updateTimeTable(TimeTable timeTable){
        return timeTableRepository.save(timeTable);
    }
    @Override
    public void deleteTimeTable(Long id){
        timeTableRepository.deleteById(id);
    }
}
