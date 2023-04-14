package aula15.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio02 {
    
    public static void main(String[] args) {
        
        /*
        2. Faça um Programa que peça um valor e mostre na tela se o valor é
        positivo ou negativo.
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um valor positivo ou negativo: ");
        int valor = teclado.nextInt();
        
        if (valor >= 0) {
            System.out.println("O valor " + valor + " é positivo.");
        } else {
            System.out.println("O valor " + valor + " é negativo.");
        }
    }
}