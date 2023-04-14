package com.loiane.cursojava;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio13 {

    public static void main(String[] args) {

        /*
        13. Tendo como dados de entrada a altura e o sexo de uma pessoa,
        construa um algoritmo que calcule seu peso ideal, utilizando as
        seguintes fórmulas:
        . Para homens: (72.7*h) - 58
        a. Para mulheres: (62.1*h) - 44.7 (h = altura)
        b. Peça o peso da pessoa e informe se ela está dentro, acima ou
        abaixo do peso.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        float altura = teclado.nextFloat();

        System.out.print("Digite seu sexo (H para Homen, M para Mulher): ");
        String sexo = teclado.next();

        float pesoHomen = (72.7f * altura) - 58;
        float pesoMulher = (62.1f * altura) - 44.7f;

        System.out.print("Digite seu peso: ");
        float peso = teclado.nextFloat();

        if ((pesoHomen == peso) && ("h".equals(sexo))) {
            System.out.println("Você está dentro do peso.");
        } else if ((pesoHomen < peso) && ("h".equals(sexo))) {
            System.out.println("Você está abaixo do peso.");
        } else if ((pesoHomen > peso) && ("h".equals(sexo))) {
            System.out.println("Você está acima do peso.");
        } else if ((pesoMulher == peso) && ("m".equals(sexo))) {
            System.out.println("Você está dentro do peso.");
        } else if ((pesoMulher > peso) && ("m".equals(sexo))) {
            System.out.println("Você está abaixo do peso.");
        } else if ((pesoMulher > peso) && ("m".equals(sexo))) {
            System.out.println("Você está acima do peso.");
        } else {
            System.out.println("Erro!");
        }
    }
}