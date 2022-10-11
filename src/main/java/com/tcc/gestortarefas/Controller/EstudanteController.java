package com.tcc.gestortarefas.Controller;

import com.tcc.gestortarefas.Service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudanteController {


    @Autowired
    EstudanteService estudanteService;
}
