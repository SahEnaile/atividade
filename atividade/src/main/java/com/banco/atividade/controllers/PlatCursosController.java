package com.banco.atividade.controllers;

import com.banco.atividade.models.Aluno;
import com.banco.atividade.models.Curso;
import com.banco.atividade.models.Professor;
import com.banco.atividade.services.AlunoService;
import com.banco.atividade.services.CursoService;
import com.banco.atividade.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/platcursos")
public class PlatCursosController {

    @Autowired
    private AlunoService alunoService;

    @Autowired
    private CursoService cursoService;

    @Autowired
    private ProfessorService professorService;

    // Aluno endpoints
    @PostMapping("/alunos")
    public Aluno createAluno(@RequestBody Aluno aluno) {
        return alunoService.save(aluno);
    }

    @GetMapping("/alunos")
    public List<Aluno> getAllAlunos() {
        return alunoService.findAll();
    }

    @GetMapping("/alunos/{id}")
    public ResponseEntity<Aluno> getAlunoById(@PathVariable int id) {
        Aluno aluno = alunoService.findById(id);
        return aluno != null ? ResponseEntity.ok(aluno) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/alunos/{id}")
    public ResponseEntity<Void> deleteAluno(@PathVariable int id) {
        alunoService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // Curso endpoints
    @PostMapping("/cursos")
    public Curso createCurso(@RequestBody Curso curso) {
        return cursoService.save(curso);
    }

    @GetMapping("/cursos")
    public List<Curso> getAllCursos() {
        return cursoService.findAll();
    }

    @GetMapping("/cursos/{id}")
    public ResponseEntity<Curso> getCursoById(@PathVariable int id) {
        Curso curso = cursoService.findById(id);
        return curso != null ? ResponseEntity.ok(curso) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/cursos/{id}")
    public ResponseEntity<Void> deleteCurso(@PathVariable int id) {
        cursoService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // Professor endpoints
    @PostMapping("/professores")
    public Professor createProfessor(@RequestBody Professor professor) {
        return professorService.save(professor);
    }

    @GetMapping("/professores")
    public List<Professor> getAllProfessores() {
        return professorService.findAll();
    }

    @GetMapping("/professores/{id}")
    public ResponseEntity<Professor> getProfessorById(@PathVariable int id) {
        Professor professor = professorService.findById(id);
        return professor != null ? ResponseEntity.ok(professor) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/professores/{id}")
    public ResponseEntity<Void> deleteProfessor(@PathVariable int id) {
        professorService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
