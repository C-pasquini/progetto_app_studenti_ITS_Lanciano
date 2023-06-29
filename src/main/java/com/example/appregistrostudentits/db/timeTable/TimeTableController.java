package com.example.appregistrostudentits.db.timeTable;

import com.example.appregistrostudentits.db.timeTable.TimeTableService.TimeTableService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;
import java.util.Optional;

public class TimeTableController {
    private final TimeTableService timeTableService;

    public TimeTableController(TimeTableService timeTableService) {
        this.timeTableService = timeTableService;
    }


    @GetMapping("/times")
    public List<TimeTable> getAllTimes() {
        return timeTableService.getAllTimeTables();
    }

    @GetMapping("/times/{id}")
    public Optional<TimeTable> getTime(@PathVariable Long id){
        return timeTableService.getTimeTable(id);
    }

    @PostMapping("/times")
    public TimeTable createTime(@RequestBody TimeTable time){
        return timeService.createTime(time);
    }

    @PutMapping("/times/{id}")
    public TimeTable updateTime(@PathVariable Long id, @RequestBody TimeTable time){
        if(!id.equals(time.getIdTime())){
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "Id in path does not match Id in Time object");
        }
        return timeTableService.updateTimeTable(time);
    }

    @DeleteMapping("/times/{id}")
    public void deleteTime(@PathVariable Long id) {
        timeTableService.deleteTimeTable(id);
    }
}
