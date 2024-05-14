package br.com.alura.objetos;

import br.com.alura.objetos.Pessoa;

public class PessoaPrincipal {

    public static void main(String[] args) {
        Pessoa primeiraPessoa = new Pessoa();

        primeiraPessoa.nome = "Barbara";
        primeiraPessoa.idade = 23;

        System.out.println(primeiraPessoa.nome + " tem " + primeiraPessoa.idade + " anos");

        primeiraPessoa.fazAniversario();

        System.out.println("A idade agora é: " + primeiraPessoa.idade);

        /*Podemos criar vários objetos do tipo br.com.alura.objetos.Pessoa, sendo que todos eles terão os mesmos atributos e métodos,
        já que são da mesma classe, mas cada um pode possuir informações distintas. Por exemplo:*/

        Pessoa segundaPessoa = new Pessoa();

        segundaPessoa.nome = "Carlos";
        segundaPessoa.idade = 20;

        System.out.println(segundaPessoa.nome + " tem " + segundaPessoa.idade + " anos");

        segundaPessoa.fazAniversario();

        System.out.println("A idade agora é: " +segundaPessoa.idade);

    }

}
