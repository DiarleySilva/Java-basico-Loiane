package com.loiane.cursojava;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio14 {
    
    public static void main(String[] args) {
        
        /*
        14. João Papo-de-Pescador, homem de bem, comprou um
        microcomputador para controlar o rendimento diário de seu trabalho.
        Toda vez que ele traz um peso de peixes maior que o estabelecido
        pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
        pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
        você faça um programa que leia a variável peso (peso de peixes) e
        verifique se há excesso. Se houver, gravar na variável excesso e na
        variável multa o valor da multa que João deverá pagar. Caso contrário
        mostrar tais variáveis com o conteúdo ZERO.
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o peso de peixes pescados: ");
        float pesoPeixe = teclado.nextFloat();
        
        float excesso = 0, multa = 0;
        
        if (pesoPeixe > 50) {
            excesso = pesoPeixe - 50;
            multa = excesso * 4;
            System.out.println("Peso dos peixes: " + pesoPeixe + "Kg.");
            System.out.println("Excesso de: " + excesso + "Kg.");
            System.out.println("Valor da multa: R$" + multa);
        } else {
            System.out.println("Peso dos peixes: " + pesoPeixe + "Kg.");
            System.out.println("Excesso de: " + excesso + "Kg.");
            System.out.println("Valor da multa: R$" + multa);
        }
    }
}