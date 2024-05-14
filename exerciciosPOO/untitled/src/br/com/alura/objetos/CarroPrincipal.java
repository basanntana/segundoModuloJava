package br.com.alura.objetos;

import br.com.alura.objetos.Carro;

public class CarroPrincipal {

    public static void main(String[] args) {

        Carro dadosCarro = new Carro();

        dadosCarro.modelo = "EcoSport";
        dadosCarro.ano = 2020;
        dadosCarro.cor ="Preto";

        //exibir ficha
        dadosCarro.exibirFichaTecnica();

        //calcular idade do carro
        System.out.println("A idade do carro: " + dadosCarro.calcularIdade() + "anos");

    }
}
