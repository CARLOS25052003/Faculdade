package models;

import enuns.Curso;

public class Aluno {
    private String nome;
    private String matricula;
    private String cpf;
    private Curso curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Aluno(String nome, String matricula, String cpf, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.curso = curso;
    }

    public void criarAluno(String nome, String matricula, String cpf, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.curso = curso;
    }
}
