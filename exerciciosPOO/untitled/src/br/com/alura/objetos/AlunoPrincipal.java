package br.com.alura.objetos;

import br.com.alura.objetos.Aluno;

public class AlunoPrincipal {

    public static void main(String[] args) {

        Aluno meuAluno = new Aluno();
        meuAluno.nome = "Heitor";
        meuAluno.idade = 18;

        meuAluno.exibeInformacoes();
    }

}

