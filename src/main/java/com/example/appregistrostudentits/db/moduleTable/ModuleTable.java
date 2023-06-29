package com.example.appregistrostudentits.db.moduleTable;


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
public class ModuleTable {
    @Id
    @GeneratedValue
    private long idModulo;

    private String nomeModulo;
    private String materia;
    private int oreModulo;

    private long idDocente;
    private long idCorso;
}
