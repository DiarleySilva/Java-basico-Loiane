package aula15.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio20 {

    public static void main(String[] args) {

        /*
        20. Faça um programa que faça 5 perguntas para uma pessoa sobre um
        crime. As perguntas são:
        . "Telefonou para a vítima?"
        a. "Esteve no local do crime?"
        b. "Mora perto da vítima?"
        c. "Devia para a vítima?"
        d. "Já trabalhou com a vítima?" O programa deve no final emitir
        uma classificação sobre a participação da pessoa no crime. Se
        a pessoa responder positivamente a 2 questões ela deve ser
        classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
        como "Assassino". Caso contrário, ele será classificado como
        "Inocente".
         */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Telefonou para a vítima? (S para SIM, N para NÃO): ");
        String resposta1 = teclado.next();
        System.out.print("Esteve no local do crime? (S para SIM, N para NÃO): ");
        String resposta2 = teclado.next();
        System.out.print("Mora perto da vítima? (S para SIM, N para NÃO): ");
        String resposta3 = teclado.next();
        System.out.print("Devia para a vítima? (S para SIM, N para NÃO): ");
        String resposta4 = teclado.next();
        System.out.print("Já trabalhou com a vítima? (S para SIM, N para NÃO): ");
        String resposta5 = teclado.next();

        int contador = 0;

        if (resposta1.equalsIgnoreCase("S")) {
            contador++;
        }
        if (resposta2.equalsIgnoreCase("S")) {
            contador++;
        }
        if (resposta3.equalsIgnoreCase("S")) {
            contador++;
        }
        if (resposta4.equalsIgnoreCase("S")) {
            contador++;
        }
        if (resposta5.equalsIgnoreCase("S")) {
            contador++;
        }
        
        System.out.println("Respostas SIM: " + contador);
        System.out.println("Respostas NÃO: " + (5 - contador));

        if (contador == 2) {
            System.out.println("Você está classificada como suspeita.");
        } else if (contador == 3 || contador == 4) {
            System.out.println("Você está classificada como cúmplice.");
        } else if (contador == 5) {
            System.out.println("Você está classificada como assassino(a).");
        } else if (contador < 2) {
            System.out.println("Você está classificada como inocente.");
        }
    }
}