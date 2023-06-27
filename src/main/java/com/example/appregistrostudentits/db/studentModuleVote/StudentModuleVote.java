package com.example.appregistrostudentits.db.studentModuleVote;

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
public class StudentModuleVote {
    @Id
    @GeneratedValue
    private long idVoto;
    private int voto;

    private long idModulo;  // Foreign key per i moduli
    private long idStudente;    // Foreign key per gli studenti
}
