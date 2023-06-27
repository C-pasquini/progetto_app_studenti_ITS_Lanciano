package com.example.appregistrostudentits.db.teacherTable;

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
public class TeacherTable {
    @Id
    @GeneratedValue
    private long idDocente;

    private String Nome;
    private String Cognome;
    private int valDocente;
    private String titoliStudio;
}
