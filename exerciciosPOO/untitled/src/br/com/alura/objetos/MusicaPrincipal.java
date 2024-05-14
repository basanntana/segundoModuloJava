package br.com.alura.objetos;

import br.com.alura.objetos.Musica;

public class MusicaPrincipal {

    public static void main(String[] args) {

        Musica dadosMusica = new Musica();

        dadosMusica.titulo ="Me myself and I";
        dadosMusica.artista ="Beyoncé";
        dadosMusica.anoDeLancamento = 2003;
        dadosMusica.somaDasAvaliacoes = 10;
        dadosMusica.numAvaliacoes = 1;

        dadosMusica.exibirFicha();

        dadosMusica.avalia(4.5);
        dadosMusica.avalia(3.8);
        dadosMusica.avalia(5.0);

        double mediaAvaliacoes = dadosMusica.pegaMedia();
        System.out.println("Média das avaliações: " + mediaAvaliacoes);


    }

}
