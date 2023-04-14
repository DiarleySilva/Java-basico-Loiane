package com.loiane.cursojava;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio06 {
    
    public static void main(String[] args) {
        
        /*
        6. Faça um Programa que peça o raio de um círculo, calcule e mostre
        sua área.
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o raio do circulo: ");
        double raio = teclado.nextFloat();
        
        //double area = 3.14 * Math.pow(raio, 2); 
        double area = Math.PI * Math.pow(raio, 2); // A = PI * Raio2
        
        System.out.printf("A área do circulo é de: " + area);
    }
}