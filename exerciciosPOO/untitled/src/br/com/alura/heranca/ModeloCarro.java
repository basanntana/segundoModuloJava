package br.com.alura.heranca;

public class ModeloCarro extends Carro{

         private String cor;
         private String cambio;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public void exibirCores(){
        System.out.println(getCor());
    }

    public void exibirCambios(){
        System.out.println(getCambio());
    }
}
