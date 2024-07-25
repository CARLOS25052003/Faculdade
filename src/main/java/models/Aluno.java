package models;

public class Aluno {
    private String nome;
    private String matricula;
    private String cpf;
    private Cursos curso;

    public Aluno(String nome, String matricula, String cpf, Cursos curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.curso = curso;
    }
}
