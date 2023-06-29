package com.example.appregistrostudentits.db.studentTable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class StudentTable {
    @Id
    @GeneratedValue
    private long idStudente; // Primary key

    private String cf;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String residence;
    private double tassoAssenze;

    private long idVoto; // Foreign key
}
