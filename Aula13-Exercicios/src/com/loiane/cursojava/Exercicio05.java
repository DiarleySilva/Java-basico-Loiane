package com.loiane.cursojava;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio05 {
    
    public static void main(String[] args) {
        
        /*
        5. Faça um Programa que converta metros para centímetros.
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o tamanha em metros: ");
        float metros = teclado.nextFloat();
        
        System.out.println(metros + " metro em centíemtros é igual a: " + (metros * 100) + "cm.");
    }
}