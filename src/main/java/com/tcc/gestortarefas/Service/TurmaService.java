package com.tcc.gestortarefas.Service;

import com.tcc.gestortarefas.Model.Turma;
import com.tcc.gestortarefas.Repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurmaService {

    @Autowired
    TurmaRepository turmaRepository;

public List<Turma> getAll(){
    return  turmaRepository.findAll();
}

}
