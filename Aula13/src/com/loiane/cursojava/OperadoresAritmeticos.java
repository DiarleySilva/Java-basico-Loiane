package com.loiane.cursojava;

/**
 * @author diarley
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int resultado = 1 + 2;
        System.out.println("1 + 2 = " + resultado);

        resultado = resultado - 1;
        System.out.println("Resultado - 1 = " + resultado);

        resultado = resultado * 2;
        System.out.println("Resultado * 2 = " + resultado);

        resultado = resultado / 2;
        System.out.println("Resultado / 2 = " + resultado);

        resultado = resultado + 8;
        System.out.println("Resultado + 8 = " + resultado);

        resultado = resultado % 7;
        System.out.println("Resultado % 7 = " + resultado);

        String primeiroNome = "Esta é ";
        String segundoNome = " uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        System.out.println("Valor atual do resultado = " + resultado);

        resultado = resultado + 1;
        System.out.println("Resultado + 1 = " + resultado);

        resultado++;
        System.out.println("Resultado ++ = " + resultado);

        System.out.println("Resultado ++ = " + resultado++); // Adiciona +1 depois
        // É a mesma coisa que: resultado = resultado + 1 ou resultado += 1

        System.out.println("++ Resultado = " + ++resultado); // Adiciona +1 antes
        // É a mesma coisa que: resultado = resultado + 1 ou resultado += 1

        System.out.println("Resultado -- = " + resultado--); // Subtrai -1 depois
        // É a mesma coisa que: resultado = resultado - 1 ou resultado -= 1
        
        System.out.println("-- Resultado = " + --resultado); // Subtrai -1 antes
        // É a mesma coisa que: resultado = resultado - 1 ou resultado -= 1
    }
}