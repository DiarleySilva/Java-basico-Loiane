package com.loiane.cursojava;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio09 {
    
    public static void main(String[] args) {
        
        /*
        9. Faça um Programa que peça a temperatura em graus Farenheit,
        transforme e mostre a temperatura em graus Celsius.
        o C = (5 * (F-32) / 9).
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        float tempFah = teclado.nextInt();
        
        float celsius = (5 * (tempFah - 32) / 9);
        
        System.out.println("A temperaura em Celsius é de: " + celsius + "°C.");
    }
}