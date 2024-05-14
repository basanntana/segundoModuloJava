package br.com.alura.musicas.modelos;

public class Preferidas {

    public void incluir(Audio audio){

        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + """
                     - É considerado sucesso absoluto e preferido por todos!""");
        }else {
            System.out.println(audio.getTitulo() + """
                     - E também é um dos que todos estão curtindo""");
        }
    }
}
