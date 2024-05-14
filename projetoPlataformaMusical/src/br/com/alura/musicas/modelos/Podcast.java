package br.com.alura.musicas.modelos;

public class Podcast extends Audio {

    private String host;

    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public int getClassificacao() {

        //definição das curtidas
        if (this.getTotalcurtidas() > 50){

            return 10;

        } else{
            return 8;
        }

    }
}
