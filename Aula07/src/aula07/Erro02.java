package aula07;

/**
 * @author diarley
 */
public class Erro02 {
    
    public static void main(String[] args) {
        
        // var int cont; Varipavel declarada incorretamente
        // int cont; Variável declarada corretamente, mas não inicializada
        int cont = 0; // Variável declarada corretamente e inicializada
        
        // System.out.println("Você digitou: " + cont); Variável não inicializada
        System.out.println("Você digitou: " + cont);
    }
}