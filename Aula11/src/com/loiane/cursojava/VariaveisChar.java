package com.loiane.cursojava;

/**
 * @author diarley
 */
public class VariaveisChar {
    
    public static void main(String[] args) {
        
        // char o = 'o';
        // char i = 'i';
        
        char o = 111;
        char i = 105;
        
        // char interrogacao = 0x00e1; valor = "á"
        char interrogacao = 0x003f; // valor = "?"
        
        System.out.println(o+i);
        System.out.println("" + o + i);
        System.out.println("" + o + i + interrogacao);
    }
}