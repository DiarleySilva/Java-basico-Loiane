package aula15.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio08 {
    
    public static void main(String[] args) {
        
        /*
        8. Faça um programa que pergunte o preço de três produtos e informe
        qual produto você deve comprar, sabendo que a decisão é sempre
        pelo mais barato.
        */
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o preço do primeiro produto: ");
        float preco1 = teclado.nextFloat();
        System.out.print("Digite o preço do segundo produto: ");
        float preco2 = teclado.nextFloat();
        System.out.print("Digite o preço do terceiro produto: ");
        float preco3 = teclado.nextFloat();
        
        if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("Compre o produto mais barato de R$" + preco1);
        } else if (preco2 < preco2 && preco2 < preco3) {
            System.out.println("Compre o produto mais barato de R$" + preco2);
        } else if (preco3 < preco1 && preco3 < preco2) {
            System.out.println("Compre o produto mais barato de R$" + preco3);
        }
    }
}