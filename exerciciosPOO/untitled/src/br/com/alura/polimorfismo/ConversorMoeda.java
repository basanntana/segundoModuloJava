package br.com.alura.polimorfismo;

public class ConversorMoeda implements ConversaoFinanceira {

//    Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira
//    com o método converterDolarParaReal()
//    para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 4.80;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valorReal);
    }

}
