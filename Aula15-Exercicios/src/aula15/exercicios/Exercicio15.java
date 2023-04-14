package aula15.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio15 {

    public static void main(String[] args) {

        /*
        15. Faça um Programa que peça os 3 lados de um triângulo. O programa
        deverá informar se os valores podem ser um triângulo. Indique, caso
        os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
        escaleno.
        Dicas:
        - Três lados formam um triângulo quando a soma de quaisquer
        dois lados for maior que o terceiro;
        - Triângulo Equilátero: três lados iguais;
        - Triângulo Isósceles: quaisquer dois lados iguais;
        - Triângulo Escaleno: três lados diferentes;
         */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do triângulo: ");
        int lado1 = teclado.nextInt();

        System.out.print("Digite o segundo lado do triângulo: ");
        int lado2 = teclado.nextInt();

        System.out.print("Digite o terceiro lado do triângulo: ");
        int lado3 = teclado.nextInt();

        if (((lado1 + lado2) > lado3) || (lado1 + lado3) > lado2 || (lado2 + lado3) > lado1) {

            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                System.out.println("É um triângulo equilátero.");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
                System.out.println("É um triângulo escaleno.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É um triângulo isósceles.");
            }
            
        } else {
            System.out.println("Não é um triângulo.");
        }
    }
}