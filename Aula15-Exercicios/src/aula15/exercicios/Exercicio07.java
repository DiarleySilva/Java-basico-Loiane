package aula15.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio07 {
    
    public static void main(String[] args) {
        
        /*
        7. Faça um Programa que leia três números e mostre o maior e o menor
        deles.
        */
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = teclado.nextInt();
        System.out.print("Digite o terceiro número: ");
        int numero3 = teclado.nextInt();
        
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O maior número é o " + numero1 + ".");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O maior número é o " + numero2 + ".");
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("O maior número é o " + numero3 + ".");
        }
        
        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println("O menor número é o " + numero1 + ".");
        } else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println("O menor número é o " + numero2 + ".");
        } else if (numero3 < numero1 && numero3 < numero2) {
            System.out.println("O menor número é o " + numero3 + ".");
        }
    }
}