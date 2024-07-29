package models;

import enuns.Materias;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Aluno {
    @Setter
    @Getter
    private String nome;
    @Setter
    @Getter
    private String matricula;
    @Setter
    @Getter
    private String cpf;
    @Setter
    @Getter
    private Materias materias;


    public Materias getCurso() {
        return materias;
    }

    public void setCurso(Materias materias) {
        this.materias = materias;
    }

    public void criarAluno(String nome, String matricula, String cpf, Materias materias) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.materias = materias;
    }
}
