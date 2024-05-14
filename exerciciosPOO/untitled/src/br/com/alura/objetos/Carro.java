package br.com.alura.objetos;

public class Carro {

    /*Crie uma classe br.com.alura.objetos.Carro com atributos modelo,
     ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.*/

    String modelo;
    String cor;
    int ano;

    void exibirFichaTecnica(){
        System.out.println("O modelo do carro é: " + modelo);
        System.out.println("A cor do carro é: " + cor);
        System.out.println("O ano do carro é: "+ ano);
    }

    int calcularIdade(){
        return 2024 - ano;
    }
}
