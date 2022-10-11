package com.tcc.gestortarefas.Controller;

import com.tcc.gestortarefas.Model.Turma;
import com.tcc.gestortarefas.Service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/turma")
public class TurmaController {


    TurmaService turmaService;

    public TurmaController(TurmaService turmaService) {
        this.turmaService = turmaService;
    }

    @GetMapping
    public List<Turma> getAll(){

        return turmaService.getAll();
    }

}
