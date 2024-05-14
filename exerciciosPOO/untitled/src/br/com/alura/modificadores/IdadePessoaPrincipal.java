package br.com.alura.modificadores;

public class IdadePessoaPrincipal {

    public static void main(String[] args) {

        IdadePessoa dadosPessoa1 = new IdadePessoa();

        dadosPessoa1.setNome("Barbara");
        dadosPessoa1.setIdade(23);

        IdadePessoa dadosPessoa2 = new IdadePessoa();

        dadosPessoa2.setNome("Heitor");
        dadosPessoa2.setIdade(17);

        System.out.println(dadosPessoa1.getNome() + " tem " + dadosPessoa1.getIdade() + " anos.");
        dadosPessoa1.verificarIdade();

        System.out.println(dadosPessoa2.getNome() + " tem " + dadosPessoa2.getIdade() + " anos.");
        dadosPessoa2.verificarIdade();



    }
}
