package com.faculdade.demo.Controllers;

import com.faculdade.demo.enuns.Materias;
import com.faculdade.demo.models.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

import static java.lang.Integer.parseInt;

@Controller
public class AlunoController {

    public String gerarID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().substring(0,6);
    }

    Aluno aluno1 = new Aluno("Windson", gerarID(), Materias.INFORMATICA);
    Aluno aluno2 = new Aluno("Flagio", gerarID(), Materias.MEDICINA);
    Aluno aluno3 = new Aluno("Gadelha", gerarID(), Materias.ADMINISTRAÇÃO);
    Aluno aluno4 = new Aluno("Everton", gerarID(), Materias.DIREITO);
    Aluno aluno5 = new Aluno("Alex", gerarID(), Materias.PSICOLOGIA);

    ArrayList<Aluno> alunos = new ArrayList<Aluno>(
            Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5)
    );

    @ResponseBody
    @RequestMapping("/alunos")
    public ArrayList<Aluno> listar() {

        return alunos;
    }

    @ResponseBody
    @RequestMapping("/{nome}")
    public Aluno listarAluno (@PathVariable String nome){
        var aluno = alunos.stream().filter(nomeAluno -> nomeAluno.getNome().equals(nome)) ;

        return aluno.findFirst().get();
    }
}