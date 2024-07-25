package models;

import enuns.Curso;

import java.util.List;

public class Cursos {
    private int id;
    private Curso curso;
    private List<Aluno> alunos;

    public Cursos(int id, Curso curso, List<Aluno> alunos) {
        this.id = id;
        this.curso = curso;
        this.alunos = alunos;
    }
}
