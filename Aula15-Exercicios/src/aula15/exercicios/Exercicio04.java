package aula15.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio04 {

    public static void main(String[] args) {

        /*
        4. Faça um Programa que verifique se uma letra digitada é vogal ou
        consoante.
        */
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        // String letra = teclado.next();
        String letra = teclado.next().toLowerCase();

        // Vogais: a, e, i, o, u
        
        // Usando if else
        
        /*
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")
                || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")
                || letra.equalsIgnoreCase("u")) {
            System.out.println("A letra " + letra + " é uma vogal.");
        } else {
            System.out.println("A letra " + letra + " é uma consoante.");
        } */
        
        // Usando switch
        
        if (letra.length() > 1) {
            System.out.println("Não é uma letra válida.");
        } else {
            switch (letra) {
            case "a":
                System.out.println("A letra " + letra + " é uma vogal.");
                break;
            case "e":
                System.out.println("A letra " + letra + " é uma vogal.");
                break;
            case "i":
                System.out.println("A letra " + letra + " é uma vogal.");
                break;
            case "o":
                System.out.println("A letra " + letra + " é uma vogal.");
                break;
            case "u":
                System.out.println("A letra " + letra + " é uma vogal.");
                break;
            default:
                System.out.println("A letra " + letra + " é uma consoante.");
            }
        }
        
        /*
        if ("a".equals(letra)) {
            System.out.println("A letra " + letra + " é uma vogal.");
        } else if ("e".equals(letra)) {
            System.out.println("A letra " + letra + " é uma vogal.");
        } else if ("i".equals(letra)) {
            System.out.println("A letra " + letra + " é uma vogal.");
        } else if ("o".equals(letra)) {
            System.out.println("A letra " + letra + " é uma vogal.");
        } else if ("u".equals(letra)) {
            System.out.println("A letra " + letra + " é uma vogal.");
        } else {
            System.out.println("A letra " + letra + " é uma consoante.");
        }
        */
    }
}