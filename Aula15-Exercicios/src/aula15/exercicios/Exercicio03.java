package aula15.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio03 {

    public static void main(String[] args) {

        /*
        3. Faça um Programa que verifique se uma letra digitada é "F" ou "M".
        Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
        */
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = teclado.next();
        
        if (letra.equalsIgnoreCase("f")) {
            System.out.println("F- Feminino.");
        } else if (letra.equalsIgnoreCase("m")) {
            System.out.println("M - Masculino.");
        } else {
            System.out.println("Sexo inválido.");
        }
        
        /*
        if ("M".equals(letra)) {
            System.out.println("M - Masculino");
        } else if ("m".equals(letra)) {
            System.out.println("M - Masculino");
        } else if ("F".equals(letra)) {
            System.out.println("F - Feminino");
        } else if ("f".equals(letra)) {
            System.out.println("F - Feminino");
        } else {
            System.out.println("Sexo inválido.");
        }
        */
    }
}