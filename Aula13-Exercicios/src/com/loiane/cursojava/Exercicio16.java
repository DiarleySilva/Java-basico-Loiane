package com.loiane.cursojava;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio16 {
    
    public static void main(String[] args) {
        
        /*
        16. Faça um programa para uma loja de tintas. O programa deverá pedir o
        tamanho em metros quadrados da área a ser pintada. Considere que a
        cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
        tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
        usuário a quantidades de latas de tinta a serem compradas e o preço
        total.
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
        float area = teclado.nextFloat();
        
        float litros = area / 3f;
        //float latas = 
        //float preco1 = litros / 18f;
        float preco2 = (litros * 18f) * 80f;
        
        System.out.println("litros gastos: " + litros);
        //System.out.println("valor total: " + preco1);
        System.out.println("valor total: " + preco2);
    }
}
