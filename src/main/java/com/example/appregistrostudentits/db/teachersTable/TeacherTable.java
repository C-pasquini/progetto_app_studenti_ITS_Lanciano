package com.example.appregistrostudentits.db.teachersTable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class TeacherTable {
    private long idDocente;

    private String Nome;
    private String Cognome;
    private int valDocente;
    private String titoliStudio;
}
