package com.example.appregistrostudentits.db.timeTable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class TimeTable {
    @Id
    @GeneratedValue
    private long idTime;
    private String weekday;
    private String hours;
    private long idModule;
}
