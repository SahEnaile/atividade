package com.banco.atividade.services;

import com.banco.atividade.models.Aluno;
import java.util.List;

public interface AlunoService {
    Aluno save(Aluno aluno);
    List<Aluno> findAll();
    Aluno findById(int id);
    void delete(int id);
}
