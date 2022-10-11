package com.tcc.gestortarefas.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Relatorio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String texto;
    private String titulo;
    private Boolean corrigido;
    private double nota;
    @ManyToOne
    @JoinColumn(name = "turma_id")
    @JsonBackReference
    private Turma turma;

}
