package br.com.alura.polimorfismo;

public class TabuadaMultiplicacao implements Tabuada {


//    Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada()
//    para exibir a tabuada de um número. A classe deve receber o número como parâmetro.


    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("Tabuada de multiplicação do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
