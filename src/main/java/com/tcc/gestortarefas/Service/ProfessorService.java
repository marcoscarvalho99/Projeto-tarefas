package com.tcc.gestortarefas.Service;

import com.tcc.gestortarefas.Model.Professor;
import com.tcc.gestortarefas.Repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;

    public List<Professor> findAll() {

       return professorRepository.findAll();
    }

    public void save(Professor professor) {
        professorRepository.save(professor);
    }

    public Object findOne(Long id) {

        try {

            return  professorRepository.findById(id);

        }catch (Exception e){
            System.out.println("não existe");
            return ResponseEntity.notFound().build();
        }

    }
}
