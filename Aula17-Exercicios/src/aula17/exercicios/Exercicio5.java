package aula17.exercicios;

import java.util.Scanner;

/**
 * @author Diarley Silva Santos
 */
public class Exercicio5 {

    public static void main(String[] args) {

        /*
        5. Altere o programa anterior permitindo ao usuário informar as
        populações e as taxas de crescimento iniciais. Valide a entrada e
        permita repetir a operação.
         */
        
        Scanner teclado = new Scanner(System.in);

        boolean validacao = false;
        int populacaoA = 0, populacaoB = 0, contador = 0;
        float taxaA = 0, taxaB = 0;

        do {

            System.out.print("Digite a população do país A: ");
            populacaoA = teclado.nextInt();

            if (populacaoA > 0) {
                validacao = true;
            } else {
                System.out.println("A população de A precisar ser maior que 0. Digite novamente.");
            }

        } while (!validacao);

        validacao = false;

        do {

            System.out.print("Digite a taxa de crescimento do país A: ");
            taxaA = teclado.nextFloat();

            if (taxaA > 0) {
                validacao = true;
            } else {
                System.out.println("A taxa da população de A precisar ser maior que 0. Digite novamente.");
            }

        } while (!validacao);

        validacao = false;

        do {

            System.out.print("Digite a população do país B: ");
            populacaoB = teclado.nextInt();

            if (populacaoB > 0) {
                validacao = true;
            } else {
                System.out.println("A população de B precisar ser maior que 0. Digite novamente.");
            }

        } while (!validacao);

        validacao = false;

        do {

            System.out.print("Digite a taxa de crescimento da população do país B: ");
            taxaB = teclado.nextFloat();

            if (taxaB > 0) {
                validacao = true;
            } else {
                System.out.println("A taxa da população de B precisar ser maior que 0. Digite novamente.");
            }

        } while (!validacao);

        while (populacaoA < populacaoB) {

            populacaoA += (populacaoA / 100) * taxaA;
            populacaoB += (populacaoB / 100) * taxaB;

            contador++;

        }

        System.out.println("População A = " + populacaoA);
        System.out.println("População B = " + populacaoB);
        System.out.println("Anos = " + contador);
    }
}