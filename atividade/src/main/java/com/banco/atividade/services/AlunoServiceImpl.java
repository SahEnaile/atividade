package com.banco.atividade.services;

import com.banco.atividade.models.Aluno;
import com.banco.atividade.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Aluno save(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @Override
    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno findById(int id) {
        return alunoRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        alunoRepository.deleteById(id);
    }
}
