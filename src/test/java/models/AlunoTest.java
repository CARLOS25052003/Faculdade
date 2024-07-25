package models;

import enuns.Curso;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlunoTest {

    Aluno aluno1 = new Aluno("Windson", "2015696", "cpf", Curso.INFORMATICA);
    Aluno aluno2 = new Aluno("Flagio", "4444", "cpf", Curso.MEDICINA);
    Aluno aluno3 = new Aluno("Gadelha", "212", "cpf", Curso.ADMINISTRAÇÃO);


    @Test
    void lista_de_alunos_deve_ser_alterada() {
        Cursos cursos = new Cursos(1,Curso.INFORMATICA, List.of());
        Faculdade faculdade = new Faculdade(List.of(cursos), new ArrayList<>());

        assertEquals(0, faculdade.aluno.size());

        faculdade.matricular(aluno2);
        faculdade.matricular(aluno3);
        faculdade.matricular(aluno1);

        assertEquals(3, faculdade.aluno.size());
    }

}