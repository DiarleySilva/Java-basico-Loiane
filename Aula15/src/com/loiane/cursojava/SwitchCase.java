package com.loiane.cursojava;

import java.util.Scanner;

/**
 * @author diarley
 */
public class SwitchCase {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();
        
        /*
        if (numero == 1) {
            System.out.println("Domingo.");
        } else if (numero == 2) {
            System.out.println("Segunda.");
        } else if (numero == 3) {
            System.out.println("Terça.");
        } else if (numero == 4) {
            System.out.println("Quarta.");
        } else if (numero == 5) {
            System.out.println("Quinta.");
        } else if (numero == 6) {
            System.out.println("Sexta.");
        } else if (numero == 7) {
            System.out.println("Sábado.");
        } else {
            System.out.println("O número não corresponde a nenhum dia da semana.");
        }
        */
        /*
        switch (numero) {
            case 1:
                System.out.println("Domingo.");
                break;
            case 2:
                System.out.println("Segunda.");
                break;
            case 3:
                System.out.println("Terça.");
                break;
            case 4:
                System.out.println("Quarta.");
                break;
            case 5:
                System.out.println("Quinta.");
                break;
            case 6:
                System.out.println("Sexta.");
                break;
            case 7:
                System.out.println("Sábado.");
                break;
            default:
                System.out.println("O número não corresponde a nenhum dia da semana.");
        */
        switch (numero) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil.");
                break;
            case 1:
            case 7:
                System.out.println("Fim de semana.");
                break;
            default:
                System.out.println("O número não corresponde a nenhum dia da semana.");
        }
    }
}