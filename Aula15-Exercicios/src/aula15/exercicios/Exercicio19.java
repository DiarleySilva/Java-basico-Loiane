package aula15.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio19 {

    public static void main(String[] args) {

        /*
        19. Faça um Programa que leia 2 números e em seguida pergunte ao
        usuário qual operação ele deseja realizar. O resultado da operação
        deve ser acompanhado de uma frase que diga se o número é:
        . par ou ímpar;
        a. positivo ou negativo;
         */
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = teclado.nextInt();

        System.out.println("Operações: \n+ = Adição\n- = Subtração\n/ = Divisão\n* = Multiplicação");
        System.out.print("Digite a operação desejada (+, -, /, *): ");
        String operacao = teclado.next();

        int resultado = 0;
        boolean validacao = true;

        switch (operacao) {
            case "+":
                System.out.println("A soma é: " + (resultado = (numero1 + numero2)));
                break;
            case "-":
                System.out.println("A subtração é: " + (resultado = (numero1 + numero2)));
                break;
            case "/":
                System.out.println("A divisão é: " + (resultado = (numero1 + numero2)));
                break;
            case "*":
                System.out.println("A multiplicação é: " + (resultado = (numero1 + numero2)));
                break;
            default:
                System.out.println("Operação inválida.");
        }

        if (validacao) {
            System.out.println("Resultado: " + resultado);

            if (resultado >= 0) {
                System.out.println("O resultado é positivo.");
            } else {
                System.out.println("O resultado é negativo.");
            }

            if (resultado % 2 == 0) {
                System.out.println("O resultado é par.");
            } else {
                System.out.println("O resultado é impar.");
            }
        }
    }
}