package com.banco.atividade.services;

import com.banco.atividade.models.Professor;
import java.util.List;

public interface ProfessorService {
    Professor save(Professor professor);
    List<Professor> findAll();
    Professor findById(int id);
    void delete(int id);
}
