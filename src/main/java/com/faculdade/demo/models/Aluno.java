package com.faculdade.demo.models;

import com.faculdade.demo.enuns.Materias;
import lombok.*;

import java.util.UUID;

import static java.lang.Integer.parseInt;

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
    @Generated
    private Materias materias;


    public Materias getCurso() {
        return materias;
    }

    public void setCurso(Materias materias) {
        this.materias = materias;
    }

    public void criarAluno(String nome, String matricula, Materias materias) {
        this.nome = nome;
        this.matricula = gerarID();
        this.materias = materias;
    }

    public String gerarID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().substring(0,6);
    }
}
