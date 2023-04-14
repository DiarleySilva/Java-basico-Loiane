package com.loiane.cursojava;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio10 {
    
    public static void main(String[] args) {
        
        /*
        10.Faça um Programa que peça a temperatura em graus Celsius,
        transforme e mostre em graus Farenheit.
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em graus Celsius: ");
        float tempCelsius = teclado.nextInt();
        
        float fahrenheit = (tempCelsius * 9 / 5) + 32;
        
        System.out.println("A temperaura em Fahrenheit é de: " + fahrenheit + "°F.");
    }
}