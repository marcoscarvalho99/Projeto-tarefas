package com.tcc.gestortarefas.Controller;

import com.tcc.gestortarefas.Service.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RelatorioController {

    @Autowired
    RelatorioService relatorioService;



}
