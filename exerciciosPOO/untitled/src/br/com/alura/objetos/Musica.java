package br.com.alura.objetos;

public class Musica {

    /*Crie uma classe br.com.alura.objetos.Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes,
     e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.*/

    //atributos

    String titulo;
    String artista;
    int anoDeLancamento;
    int somaDasAvaliacoes;
    int numAvaliacoes;

    void exibirFicha(){
        System.out.println("O título da canção é:  " + titulo);
        System.out.println("O título da canção é:  " + artista);
        System.out.println("O título da canção é:  " + anoDeLancamento);

    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / numAvaliacoes;
    }

}
