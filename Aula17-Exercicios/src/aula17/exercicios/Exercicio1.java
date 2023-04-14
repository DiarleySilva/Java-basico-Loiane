package aula17.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio1 {

    public static void main(String[] args) {

        /*
        1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma
        mensagem caso o valor seja inválido e continue pedindo até que o
        usuário informe um valor válido.
         */
        
        Scanner teclado = new Scanner(System.in);

        boolean validacaoNota = false;

        do {

            System.out.print("Digite uma nota entre 0 e 10: ");
            byte nota = teclado.nextByte();

            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota digitada: " + nota);
                validacaoNota = true;
            } else {
                System.out.println("Nota inválida. Tente novamente.");
                // validacaoNota = false;
            }
            
        } while (!validacaoNota);
    }
}