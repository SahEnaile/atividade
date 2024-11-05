package com.banco.atividade.services;

import com.banco.atividade.models.Curso;
import java.util.List;

public interface CursoService {
    Curso save(Curso curso);
    List<Curso> findAll();
    Curso findById(int id);
    void delete(int id);
}
