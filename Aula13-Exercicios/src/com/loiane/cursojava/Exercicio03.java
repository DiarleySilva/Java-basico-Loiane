package com.loiane.cursojava;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio03 {
    
    public static void main(String[] args) {
        
        /*
        3. Faça um Programa que peça dois números e imprima a soma.
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int numero1 = teclado.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = teclado.nextInt();
        
        System.out.println("A soma dos dois números é " + (numero1 + numero2) + ".");
    }
}