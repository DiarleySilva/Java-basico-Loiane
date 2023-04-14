package aula19.exercicios;

import java.util.Scanner;

/**
 * @author Diarley Silva Santos
 */
public class Exercicio4 {
    
    public static void main(String[] args) {
        
        /*
        4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
        mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
        raiz quadrada do respectivo elemento de A, ou seja:
        B[i] = sqrt(A[i]).
        */
        
        Scanner teclado = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.print("Digite o valor da posição " + i + ": ");
            vetorA[i] = teclado.nextInt();

            vetorB[i] = (int) Math.sqrt(vetorA[i]);
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