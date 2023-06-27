package com.example.appregistrostudentits.db.courseTable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CourseTable {
    @Id
    @GeneratedValue
    private long idCorso;

    private String nomeCorso;
    private String programma;
}
