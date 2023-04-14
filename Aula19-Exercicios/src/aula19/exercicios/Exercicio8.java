package aula19.exercicios;

import java.util.Scanner;

/**
 * @author Diarley Silva Santos
 */
public class Exercicio8 {
    
    public static void main(String[] args) {
        
        /*
        8. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
        um vetor C, onde cada elemento de C é a multiplicação dos
        respectivos elementos em A e B, ou seja:
        C[i] = A[i] * B[i].
        */
        
        Scanner teclado = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.print("Digite o valor da posição " + i + " do vetor A: ");
            vetorA[i] = teclado.nextInt();
            
            System.out.print("Digite o valor da posição " + i + " do vetor B: ");
            vetorB[i] = teclado.nextInt();

            vetorC[i] = vetorA[i] * vetorB[i];
        }
        
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println();
        
        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        
        System.out.println();
        
        System.out.println("Vetor C = Vetor A * Vetor B ");
        for (int i = 0; i < 10; i++) {
            System.out.println(vetorA[i] + " + " + vetorB[i] + " = " + vetorC[i]);
        }
    }
}