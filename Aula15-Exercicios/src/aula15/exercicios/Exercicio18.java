package aula15.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio18 {
    
    public static void main(String[] args) {
        
        /*
        18. Faça um Programa que peça um número inteiro e determine se ele é
        par ou impar. Dica: utilize o operador módulo (resto da divisão).
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = teclado.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é impar.");
        }
    }
}