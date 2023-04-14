package aula15.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio14 {
    
    public static void main(String[] args) {
        
        /*
        14. Faça um programa que lê as duas notas parciais obtidas por um aluno
        numa disciplina ao longo de um semestre, e calcule a sua média. A
        atribuição de conceitos obedece à tabela abaixo:
        Média de Aproveitamento
        Conceito
        Entre 9.0 e 10.0A
        Entre 7.5 e 9.0B
        Entre 6.0 e 7.5C
        Entre 4.0 e 6.0D
        Entre 4.0 e zeroE
        O algoritmo deve mostrar na tela as notas, a média, o conceito
        correspondente e a mensagem “APROVADO” se o conceito for
        A, B ou C ou “REPROVADO” se o conceito for D ou E.
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        float nota1 = teclado.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        float nota2 = teclado.nextFloat();
        
        float media = (nota1 + nota2) / 2;
        
        if (media > 9 && media < 10) {
            
            System.out.println("Primeira nota: " + nota1);
            System.out.println("Segunda nota: " + nota2);
            System.out.println("Média: " + media);
            System.out.println("Conceito: A");
            System.out.println("APROVADO(A)!");
            
        } else if (media > 7.5f && media < 9) {
            
            System.out.println("Primeira nota: " + nota1);
            System.out.println("Segunda nota: " + nota2);
            System.out.println("Média: " + media);
            System.out.println("Conceito: B");
            System.out.println("APROVADO(A)!");
            
        } else if (media > 6 && media < 7.5f) {
            
            System.out.println("Primeira nota: " + nota1);
            System.out.println("Segunda nota: " + nota2);
            System.out.println("Média: " + media);
            System.out.println("Conceito: C");
            System.out.println("APROVADO(A)!");
            
        } else if (media > 4 && media < 6) {
            
            System.out.println("Primeira nota: " + nota1);
            System.out.println("Segunda nota: " + nota2);
            System.out.println("Média: " + media);
            System.out.println("Conceito: D");
            System.out.println("REPROVADO(A)!");
            
        } else if (media < 4 && media > 0) {
            
            System.out.println("Primeira nota: " + nota1);
            System.out.println("Segunda nota: " + nota2);
            System.out.println("Média: " + media);
            System.out.println("Conceito: E");
            System.out.println("REPROVADO(A)!");
            
        }
    }
}