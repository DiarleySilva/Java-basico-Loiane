package aula19.exercicios;

import java.util.Scanner;

/**
 * @author Diarley Silva Santos
 */
public class Exercicio3 {

    public static void main(String[] args) {

        /*
        3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
        mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
        ser o quadrado do respectivo elemento de A, ou seja:
        B[i] = A[i] * A[I].
         */
        
        Scanner teclado = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.print("Digite o valor da posição " + i + ": ");
            vetorA[i] = teclado.nextInt();

            vetorB[i] = vetorA[i] * vetorA[i];
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