package models;

import enuns.Materias;

public class Aluno {
    private String nome;
    private String matricula;
    private String cpf;
    private Materias materias;

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

    public Materias getCurso() {
        return materias;
    }

    public void setCurso(Materias materias) {
        this.materias = materias;
    }

    public Aluno(String nome, String matricula, String cpf, Materias materias) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.materias = materias;
    }

    public void criarAluno(String nome, String matricula, String cpf, Materias materias) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.materias = materias;
    }
}
