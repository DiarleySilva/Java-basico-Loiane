package com.loiane.cursojava;

/**
 * @author diarley
 */
public class CurtoCircuito {
    
    public static void main(String[] args) {
        
        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso & verdadeiro; // Sem curto circuito
        boolean resultado2 = falso && verdadeiro; // Com curto circuito
        
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}