package com.loiane.cursojava;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio08 {

    public static void main(String[] args) {

        /*
        8. Faça um Programa que pergunte quanto você ganha por hora e o
        número de horas trabalhadas no mês. Calcule e mostre o total do seu
        salário no referido mês.
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quanto você ganha por hora: ");
        float valorHora = teclado.nextFloat();
        
        System.out.print("Quantas horas você trabalha por mês: ");
        float horasMes = teclado.nextFloat();
        
        System.out.println("Seu salário mensal é de: " + (valorHora * horasMes));
    }
}