package aula15.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio21 {
    
    public static void main(String[] args) {
        
        /*
        21.Um posto está vendendo combustíveis com a seguinte tabela de
        descontos:
        Álcool:
        a. até 20 litros, desconto de 3% por litro
        b. acima de 20 litros, desconto de 5% por litro
        Gasolina:
        c. até 20 litros, desconto de 4% por litro
        d. acima de 20 litros, desconto de 6% por litro 
        Escreva um algoritmo que leia o número de litros vendidos, o tipo de
        combustível (codificado da seguinte forma: A-álcool, G-
        gasolina), calcule e imprima o valor a ser pago pelo cliente
        sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
        do litro do álcool é R$ 1,90.
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de litros vendidos: ");
        float litroVendido = teclado.nextFloat();
        
        System.out.print("Digite o tipo do combustivel (A - Álcool, G - Gasolina): ");
        String combustivel = teclado.next();
        
        float precoAlcool = 1.9f;
        float precoGasolina = 2.5f;
        float precoTotal = 0;
        float descontoTotal = 0; 
        int desconto = 0;
        
        if (combustivel.equalsIgnoreCase("a")) {
            
            if(litroVendido <= 20 ){
                desconto = 3;
            } else {
                desconto = 5;
            }
            
            precoTotal = litroVendido * precoAlcool;
        }
        
        if (combustivel.equalsIgnoreCase("g")) {
            
            if (litroVendido <= 20 ) {
                desconto = 4;
            } else {
                desconto = 6;
            }
            
            precoTotal = litroVendido * precoGasolina;
        }
        
        descontoTotal = (precoTotal / 100) * desconto;
        float valorFinal = precoTotal - descontoTotal;
        
        System.out.println("Litros vendidos: " + litroVendido);
        System.out.println("Combustível: " + combustivel);
        System.out.println("Valor total: R$" + precoTotal);
        System.out.println("Desconto: " + desconto + "%");
        System.out.println("Valor a ser pago: R$" + valorFinal);
    }
}