package com.loiane.cursojava;

import java.util.Scanner;

/**
 * @author diarley
 */
public class LeituraDadosTeclado {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        /*
        System.out.print("Digite seu nome completo: ");
        String nome = teclado.nextLine();
        System.out.println("Nome completo = " + nome);
        
        System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = teclado.next();
        System.out.println("Primeiro nome = " + primeiroNome);
        
        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();
        System.out.println("Idade = " + idade);
        
        System.out.print("Digite sua altura: ");
        float altura = teclado.nextFloat();
        System.out.println("Altura = " + altura);
        */
        
        System.out.println("Digite seu primeiro nome, idade, altura, quantidade de filhos e se tem animal de estimação: ");
        String primeiroNome = teclado.next();
        byte idade = teclado.nextByte();
        float altura = teclado.nextFloat();
        byte qtdFilhos = teclado.nextByte();
        boolean animalEstimacao = teclado.nextBoolean();
        
        System.out.println("Seus dados digitados: ");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Tem animal de estimação: " + animalEstimacao);
    }
}