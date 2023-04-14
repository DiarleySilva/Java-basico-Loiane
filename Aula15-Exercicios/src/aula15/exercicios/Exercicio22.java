package aula15.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio22 {

    public static void main(String[] args) {

        /*
        22. Uma fruteira está vendendo frutas com a seguinte tabela de preços:
         Até 5 Kg
           Morango R$ 2,50 por Kg
           Maçã R$ 1,80 por Kg
         Acima de 5 Kg
           Morango R$ 2,20 por Kg 
           Maçã R$ 1,50 por Kg
        Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
        compra ultrapassar R$ 25,00, receberá ainda um desconto de
        10% sobre este total. Escreva um algoritmo para ler a
        quantidade (em Kg) de morangos e a quantidade (em Kg) de
        maças adquiridas e escreva o valor a ser pago pelo cliente.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de quilos(kg) de morango: ");
        float quantiMorango = teclado.nextFloat();

        System.out.print("Digite a quantidade de quilos(kg) de maçã: ");
        float quantiMaca = teclado.nextFloat();

        float precoKgMorango = 0;
        if (quantiMorango <= 5) {
            precoKgMorango = 2.5f;
        } else {
            precoKgMorango = 2.2f;
        }

        float precoKgMaca = 0;
        if (quantiMaca <= 5) {
            precoKgMaca = 1.8f;
        } else {
            precoKgMaca = 1.5f;
        }
        
        float totalMorango = quantiMorango * precoKgMorango;
        float totalMaca = quantiMaca * precoKgMaca;
        float precoParcial = totalMorango + totalMaca;
        float precoTotal = precoParcial;
        
        if ((quantiMorango + quantiMaca > 8) || precoParcial > 25) {
            precoTotal = precoParcial - (precoParcial / 100) * 10;
        }
        
        System.out.println("Valor total dos morangos: R$" + totalMorango);
        System.out.println("Valor total das maçãs: R$" + totalMaca);
        System.out.println("Valor parcial: R$" + precoParcial);
        System.out.println("Valor total a pagar: R$" + precoTotal);
    }
}