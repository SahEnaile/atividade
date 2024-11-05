package com.banco.atividade.services;

import com.banco.atividade.models.Curso;
import com.banco.atividade.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso findById(int id) {
        return cursoRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        cursoRepository.deleteById(id);
    }
}
