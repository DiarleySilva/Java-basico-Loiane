package aula15.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio16 {

    public static void main(String[] args) {

        /*
        16. Faça um programa que calcule as raízes de uma equação do segundo
        grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
        b e c e fazer as consistências, informando ao usuário nas seguintes
        situações:
        a. Se o usuário informar o valor de A igual a zero, a equação não é
        do segundo grau e o programa não deve fazer pedir os demais
        valores, sendo encerrado;
        b. Se o delta calculado for negativo, a equação não possui raizes
        reais. Informe ao usuário e encerre o programa;
        c. Se o delta calculado for igual a zero a equação possui apenas
        uma raiz real; informe-a ao usuário;
        d. Se o delta for positivo, a equação possui duas raiz reais;
        informe-as ao usuário;
         */
        Scanner teclado = new Scanner(System.in);

        float a, b, c, delta, sqrtdelta, raiz1, raiz2;
        
        System.out.print("Digite o valor de A: ");
        a = teclado.nextFloat();
        
        if (a == 0) {
            System.out.println("A equação não é do segundo grau.");
            System.exit(0);
        }
        
        System.out.print("Digite o valor de B: ");
        b = teclado.nextFloat();
        System.out.print("Digite o valor de C: ");
        c = teclado.nextFloat();

        if (a != 0) {
            delta = (b * b) - (4 * a * c);
            sqrtdelta = (float) Math.sqrt(delta);
            if (delta >= 0) {
                raiz1 = ((-1) * b + sqrtdelta) / (2 * a);
                raiz2 = ((-1) * b - sqrtdelta) / (2 * a);
                System.out.println("Delta: " + delta);
                System.out.printf("Raízes: %.2f e %.2f", raiz1, raiz2);
            } else if (delta < 0) {
                System.out.println("A equação não possui raizes reais. Delta negativo.");
            } else if (delta == 0) {
                raiz1 = ((-1) * b + sqrtdelta) / (2 * a);
                raiz2 = ((-1) * b - sqrtdelta) / (2 * a);
                System.out.println("Delta: " + delta);
                System.out.printf("Raízes: %.2f e %.2f", raiz1, raiz2);
            }
        } 
    }
}