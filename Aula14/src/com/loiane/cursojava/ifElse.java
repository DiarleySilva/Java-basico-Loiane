package com.loiane.cursojava;

import java.util.Scanner;

/**
 * @author diarley
 */
public class ifElse {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        /*
        System.out.print("Digite sua idade: ");
        byte idade = teclado.nextByte();
        
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você não é maior de idade.");
        }
        */
        
        System.out.println("Digite o valor do produto: R$");
        float valor = teclado.nextFloat();

        if (valor <= 10) {
            System.out.println("Produto barato, pode comprar!");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Pode pedir um desconto!");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pode pesquisar por um mais barato!");
        } else {
            System.out.println("Produto muito caro!");
        }
    }
}