package aula15.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio17 {
    
    public static void main(String[] args) {
        
        /*
        17. Faça um Programa que peça um número correspondente a um
        determinado ano e em seguida informe se este ano é ou não bissexto.
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um ano: ");
        int ano = teclado.nextInt();
        
        if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
    }
}