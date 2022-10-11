package com.tcc.gestortarefas.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Estudante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String curso;
    private String endereco;
    private String dataNascimento;
    private String contato;
    @ManyToMany
    private List<Turma> turmas;
    //fala private  Relatorio relatorio;

}
