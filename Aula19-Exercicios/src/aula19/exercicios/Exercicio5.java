package aula19.exercicios;

import java.util.Scanner;

/**
 * @author Diarley Silva Santos
 */
public class Exercicio5 {
    
    public static void main(String[] args) {
        
        /*
        5. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
        mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
        ser o respectivo elemento de A multiplicado por sua posição (ou
        índice), ou seja:
        B[i] = A[i] * i.
        */
        
        Scanner teclado = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.print("Digite o valor da posição " + i + ": ");
            vetorA[i] = teclado.nextInt();

            vetorB[i] = vetorA[i] * i;
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
    }
}