package com.loiane.cursojava;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio12 {
    
    public static void main(String[] args) {
        
        /*
        12. Tendo como dados de entrada a altura de uma pessoa, construa um
        algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
        (72.7*altura) - 58
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite sua altura: ");
        float altura = teclado.nextFloat();
        
        float peso = (72.7f * altura) - 58;
        
        System.out.println("O peso ideal para sua altura de " + altura + "m" + " é de " + peso + "Kg.");
    }
}