package com.faculdade.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private List<Cursos> cursos;
    public ArrayList<Aluno> aluno;

    public Faculdade(List<Cursos> cursos, ArrayList<Aluno> aluno) {
        this.cursos = cursos;
        this.aluno = aluno;
    }

    public void matricular(Aluno aluno) {
        this.aluno.add(aluno);
    }

    public void desmatricular(Aluno aluno) {
        this.aluno.remove(aluno);
    }

    public void trocarCurso(Aluno aluno, Cursos cursos) {
        aluno.setCurso(cursos.materias);
        cursos.getAlunos().add(aluno);

    }

    public List<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(ArrayList<Aluno> aluno) {
        this.aluno = aluno;
    }

    public List<Cursos> getCursos() {
        return cursos;
    }

    public void setCursos(List<Cursos> cursos) {
        this.cursos = cursos;
    }
}
