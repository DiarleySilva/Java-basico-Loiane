package com.loiane.cursojava;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio11 {
    
    public static void main(String[] args) {
        
        /*
        11.Faça um Programa que peça 2 números inteiros e um número real.
        Calcule e mostre:
        a. o produto do dobro do primeiro com metade do segundo .
        b. a soma do triplo do primeiro com o terceiro.
        c. o terceiro elevado ao cubo.
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        int inteiro1 = teclado.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int inteiro2 = teclado.nextInt();
        
        System.out.print("Digite um número real: ");
        float real = teclado.nextFloat();
        
        int a = (inteiro1 * 2) * (inteiro2 / 2);
        float b = (inteiro1 * 3) + real;
        float c = (float) Math.pow(real, 3);
        
        System.out.println("O produto do dobro do primeiro com metade do segundo: " + a);
        System.out.println("A soma do triplo do primeiro com o terceiro: " + b);
        System.out.println("O terceiro elevado ao cubo: " + c);
    }
}