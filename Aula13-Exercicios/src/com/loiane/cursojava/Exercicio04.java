package com.loiane.cursojava;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio04 {
    
    public static void main(String[] args) {
        
        /*
        4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        float nota1 = teclado.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        float nota2 = teclado.nextFloat();
        
        System.out.print("Digite a teceira nota: ");
        float nota3 = teclado.nextFloat();
        
        System.out.print("Digite a quarta nota: ");
        float nota4 = teclado.nextFloat();
        
        System.out.println("A média é: " + ((nota1 + nota2 + nota3 + nota4) / 4));
    }
}