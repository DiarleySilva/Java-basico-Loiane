package com.loiane.cursojava;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio02 {
    
    public static void main(String[] args) {
        
        /*
        2. Faça um Programa que peça um número e então mostre a
        mensagem O número informado foi [número].
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        int numero = teclado.nextInt();
        System.out.println("O número informado foi " + numero + ".");
    }
}