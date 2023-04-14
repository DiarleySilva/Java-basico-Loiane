package com.loiane.cursojava;

/**
 * @author diarley
 */
public class OperadoresLogicos {
    
    public static void main(String[] args) {
        
        int valor1 = 1;
        int valor2 = 2;
        
        boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        System.out.println("Valor1 é 1 AND Valor2 é 2 - Resultado: " + resultado1);
        
        boolean resultado2 = (valor1 == 1) || (valor2 == 2);
        System.out.println("Valor1 é 1 OR Valor2 é 2 - Resultado: " + resultado2);
        
        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro && falso); // false
        System.out.println(verdadeiro || falso); // true
        System.out.println(verdadeiro ^ falso); // true
        System.out.println(!verdadeiro && falso); // false
        System.out.println(!verdadeiro || falso); // false
    }
}