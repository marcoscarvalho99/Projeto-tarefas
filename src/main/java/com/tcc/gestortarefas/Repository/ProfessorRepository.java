package com.tcc.gestortarefas.Repository;

import com.tcc.gestortarefas.Model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository  extends JpaRepository<Professor, Long> {

}
