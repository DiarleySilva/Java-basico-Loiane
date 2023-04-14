package aula15.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio01 {

    public static void main(String[] args) {
        
        /*
        1. Faça um Programa que peça dois números e imprima o maior deles.
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        float numero1 = teclado.nextFloat();
        
        System.out.print("Digite outro número: ");
        float numero2 = teclado.nextFloat();
        
        if (numero1 > numero2) {
            System.out.println("O maior número é o " + numero1);
        } else {
            System.out.println("O maior número é o " + numero2);
        }
    }
}