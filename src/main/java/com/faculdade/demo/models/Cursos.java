package com.faculdade.demo.models;

import com.faculdade.demo.enuns.Materias;

import java.util.List;

public class Cursos {
    private int id;
    public Materias materias;
    private List<Aluno> alunos;

    public Cursos(int id, Materias materias, List<Aluno> alunos) {
        this.id = id;
        this.materias = materias;
        this.alunos = alunos;
    }

    public int getId() {
        return id;
    }

    public Materias getCurso() {
        return materias;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMaterias(Materias materias) {
        this.materias = materias;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
