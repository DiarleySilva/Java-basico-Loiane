package aula17.exercicios;

/**
 * @author Diarley Silva Santos
 */
public class Exercicio4 {
    
    public static void main(String[] args) {
        
        /*
        4. Supondo que a população de um país A seja da ordem de 80000
        habitantes com uma taxa anual de crescimento de 3% e que a
        população de B seja 200000 habitantes com uma taxa de crescimento
        de 1.5%. Faça um programa que calcule e escreva o número de anos
        necessários para que a população do país A ultrapasse ou iguale a
        população do país B, mantidas as taxas de crescimento.
        */
        
        int populacaoA = 80000;
        int populacaoB = 200000;
        int contador = 0;
        
        while (populacaoA <= populacaoB) {
            
            populacaoA += (populacaoA / 100) * 3;
            populacaoB += (populacaoB / 100) * 1.5;
            
            contador++;
        }
        
        System.out.println("População A = " + populacaoA);
        System.out.println("População B = " + populacaoB);
        System.out.println("Anos = " + contador);
    }
}