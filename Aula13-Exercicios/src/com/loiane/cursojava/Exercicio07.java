package com.loiane.cursojava;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio07 {
    
    public static void main(String[] args) {
        
        /*
        7. Faça um Programa que calcule a área de um quadrado, em seguida
        mostre o dobro desta área para o usuário.
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a medida do quadrado: ");
        int medida = teclado.nextInt();
        
        int area = medida * medida;
        
        System.out.println("A área do quadrado é de: " + area);
        System.out.println("O dobro da área do quadrado é de: " + (area * 2));
    }
}