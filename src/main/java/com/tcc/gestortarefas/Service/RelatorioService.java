package com.tcc.gestortarefas.Service;

import com.tcc.gestortarefas.Repository.RelatorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelatorioService {

    @Autowired
    RelatorioRepository relatorioRepository;

}
