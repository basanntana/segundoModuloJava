package br.com.alura.heranca;

public class TesteCarro {

    public static void main(String[] args) {

        ModeloCarro meuCarro = new ModeloCarro();

        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.setCor("Preto");
        meuCarro.setCambio("Manual");
        meuCarro.exibirInfo();
        meuCarro.exibirCores();
        meuCarro.exibirCambios();
    }

}

