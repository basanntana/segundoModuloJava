package br.com.alura.objetos;

public class Aluno {

    /*Crie uma classe br.com.alura.objetos.Aluno com atributos nome, idade, e um método para exibir informações.
     Crie uma instância da classe br.com.alura.objetos.Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.*/

    String nome;
    int idade;

    void exibeInformacoes() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
    }

}
