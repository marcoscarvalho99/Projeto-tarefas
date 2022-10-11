package com.tcc.gestortarefas.Service;

import com.tcc.gestortarefas.Repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudanteService {

    @Autowired
    EstudanteRepository estudanteRepository;


}
