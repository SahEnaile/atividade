package com.banco.atividade.services;

import com.banco.atividade.models.Professor;
import com.banco.atividade.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public Professor save(Professor professor) {
        return professorRepository.save(professor);
    }

    @Override
    public List<Professor> findAll() {
        return professorRepository.findAll();
    }

    @Override
    public Professor findById(int id) {
        return professorRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        professorRepository.deleteById(id);
    }
}
