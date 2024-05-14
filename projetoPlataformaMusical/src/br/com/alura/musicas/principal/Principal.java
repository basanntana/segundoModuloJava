package br.com.alura.musicas.principal;

import br.com.alura.musicas.modelos.Musica;
import br.com.alura.musicas.modelos.Podcast;
import br.com.alura.musicas.modelos.Preferidas;

public class Principal {

    public static void main(String[] args) {

        Musica musica = new Musica();

        musica.setTitulo("Me myself and I");
        musica.setArtista("Beyonce");

        for (int i = 0; i < 1000; i++) {
            musica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            musica.curtir();
        }

        Podcast podcast = new Podcast();

        podcast.setTitulo("Podpah");
        podcast.setHost("Igao");


        for (int i = 0; i < 25; i++) {
           podcast.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            podcast.curtir();
        }

        Preferidas preferidas = new Preferidas();

        preferidas.incluir(musica);
        preferidas.incluir(podcast);
    }





}
