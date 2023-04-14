package com.loiane.cursojava;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio18 {
    
    public static void main(String[] args) {
        
        /*
        18. Faça um programa que peça o tamanho de um arquivo para download
        (em MB) e a velocidade de um link de Internet (em Mbps), calcule e
        informe o tempo aproximado de download do arquivo usando este link
        (em minutos).
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual o tamanho do arquivo (em MB): ");
        float tamanho = teclado.nextFloat();
        
        System.out.print("Qual a velocidade de internet (em Mbps): ");
        float velocidade = teclado.nextFloat();
        
        float download = tamanho / (velocidade / 8);
        
        System.out.println("Tamanho do arquivo: " + tamanho + "MB");
        System.out.println("Velocidade da internet: " + velocidade + "Mbps");
        System.out.println("Tempo aproximado de download: " + (download / 60) + " minutos.");
    }
}