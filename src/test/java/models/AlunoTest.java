package models;

import enuns.Materias;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class AlunoTest {

    Aluno aluno1 = new Aluno("Windson", "2015696", "cpf", Materias.INFORMATICA);
    Aluno aluno2 = new Aluno("Flagio", "4444", "cpf", Materias.MEDICINA);
    Aluno aluno3 = new Aluno("Gadelha", "212", "cpf", Materias.ADMINISTRAÇÃO);

    Cursos cursos1 = new Cursos(1, Materias.INFORMATICA, new ArrayList<>());
    Cursos cursos2 = new Cursos(2, Materias.DIREITO, new ArrayList<>());
    Cursos cursos3 = new Cursos(3, Materias.MEDICINA, new ArrayList<>());
    Cursos cursos4 = new Cursos(4, Materias.ADMINISTRAÇÃO, new ArrayList<>());
    Cursos cursos5 = new Cursos(5, Materias.PSICOLOGIA, new ArrayList<>());

    ArrayList<Aluno> alunos = new ArrayList<Aluno>(
            Arrays.asList(aluno1, aluno2, aluno3)
    );
    ArrayList<Cursos> cursos = new ArrayList<Cursos>(
            Arrays.asList(cursos1,cursos2,cursos3, cursos4, cursos5)
    );

    Faculdade faculdadeMock = new Faculdade(cursos, alunos);

    @Test
    void lista_de_alunos_deve_ser_alterada() {
        Faculdade faculdade = new Faculdade(List.of(cursos1), new ArrayList<>());

        assertEquals(0, faculdade.aluno.size());

        faculdade.matricular(aluno1);

        assertEquals(1, faculdade.aluno.size());
    }
    @Test
    void deve_desmatricular_aluno(){
        faculdadeMock.desmatricular(aluno2);

        assertEquals(2, faculdadeMock.aluno.size());
        assertFalse(faculdadeMock.aluno.contains(aluno2));
    }
    @Test
    void trocar_aluno_materia(){
        faculdadeMock.trocarCurso(aluno1 , cursos4);

        assertEquals(aluno1.getCurso(), cursos4.getCurso());

        assertEquals(1, cursos4.getAlunos().size());



    }

}