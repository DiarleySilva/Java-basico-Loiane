package aula15.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio10 {
    
    public static void main(String[] args) {
        
        /*
        10. Faça um Programa que pergunte em que turno você estuda. Peça
        para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
        mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
        Inválido!", conforme o caso.
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o turno em que você estuda (M-matutino ou V-Vespertino ou N- Noturno): ");
        String turno = teclado.next().toLowerCase();
        
        if ("m".equals(turno)) {
            System.out.println("Bom dia!");
        } else if ("v".equals(turno)) {
            System.out.println("Boa tarde!");
        } else if ("n".equals(turno)) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor inválido!");
        }
    }
}