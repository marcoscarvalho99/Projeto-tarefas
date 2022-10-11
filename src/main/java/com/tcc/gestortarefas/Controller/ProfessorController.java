package com.tcc.gestortarefas.Controller;

import com.tcc.gestortarefas.Model.Professor;
import com.tcc.gestortarefas.Service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ProfessorController {

    @Autowired
    ProfessorService professorService;

    @RequestMapping("/")
    public ModelAndView getHome(){

        List<Professor> professorList = professorService.findAll();
        var modelAndViel = new ModelAndView("listaProfessor");
        modelAndViel.addObject("professores",professorList);
        return modelAndViel;

    }

    @RequestMapping("/cadastrar")
    public ModelAndView getPaginaCadastro(){
        var professor = new Professor();
        var modelAndView = new ModelAndView("cadastrar");
        modelAndView.addObject("professor", professor);
         return modelAndView;
    }
    @RequestMapping(value = "/salvar", method = RequestMethod.POST)
    public ModelAndView salvarProfessor(@ModelAttribute Professor professor){
        var modelAndView = new ModelAndView("redirect:/");
        professorService.save(professor);
        return modelAndView;
    }
    @RequestMapping("/editar/{id}")
    public ModelAndView editProfessorr(@PathVariable(name = "id") Long id){

        var modelAndView = new ModelAndView("editarProfessor");
        var professor = professorService.findOne(id);
        modelAndView.addObject("professor",professor);
        return modelAndView;
    }



}
