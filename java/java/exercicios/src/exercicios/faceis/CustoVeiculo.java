/*
* O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e
* dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os
* impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo
* final ao consumidor.
* */
package exercicios.faceis;

public class CustoVeiculo {
    public static void main(String[] args) {

        double custoFabrica = 10000;

        double precoFinal = custoFabrica + custoFabrica*0.28 + custoFabrica*0.45;

        System.out.println("Preço veículo: " + precoFinal);
    }
}
