package br.com.alura.objetos;

import br.com.alura.objetos.Calculadora;

public class CalculadoraPrincipal {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);//argumento
        System.out.println(resultado);
    }
}
