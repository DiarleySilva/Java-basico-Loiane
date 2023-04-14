package aula15.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio05 {
    
    public static void main(String[] args) {
        
        /*
        5. Faça um programa para a leitura de duas notas parciais de um aluno.
        O programa deve calcular a média alcançada por aluno e apresentar:
        o A mensagem "Aprovado", se a média alcançada for maior ou
        igual a sete;
        o A mensagem "Reprovado", se a média for menor do que sete;
        o A mensagem "Aprovado com Distinção", se a média for igual a
        dez.
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        float nota1 = teclado.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        float nota2 = teclado.nextFloat();
        
        float media = (nota1 + nota2) / 2;
        
        System.out.println("Média: " + media);
        
        if (media >= 7) {
            System.out.println("Aprovado.");
        } else if (media < 7) {
            System.out.println("Reprovado.");
        } else if (media == 10) {
            System.out.println("Aprovado com distinção.");
        }
    }
}