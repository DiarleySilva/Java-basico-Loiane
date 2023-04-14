package aula17;

/**
 * @author diarley
 */
public class LoopFor {

    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        // System.out.println(i); A variável "i" só funciona dentro do loop for
        
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + " ; j = " + j);
        }
        
        // Partes ausentes
        
        System.out.println("");
        
        int contador = 0;
        
        for (; contador < 10; ) {
            System.out.println("Valor do contador: " + contador);
            //contador++;
            contador += 2;
        }
        
        // Sem partes ausentes
        
        System.out.println("");
        
        for (int contador1 = 0; contador1 < 10; contador1 += 2) {
            System.out.println("Valor do contador: " + contador1); 
        }
        
        // Loop infinito
        
        /*
        for (; ;) {
            
        }
        */
        
        // Soma
        
        int soma = 0;
        
        for (int i = 1; i < 5; soma += i++) {
            System.out.println("A soma é: " + soma);
        }
    }
}