package com.loiane.cursojava;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio15 {
    
    public static void main(String[] args) {
        
        /*
        15. Faça um Programa que pergunte quanto você ganha por hora e o
        número de horas trabalhadas no mês. Calcule e mostre o total do seu
        salário no referido mês, sabendo-se que são descontados 11% para o
        Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
        programa que nos dê:
        . salário bruto.
        a. quanto pagou ao INSS.
        b. quanto pagou ao sindicato.
        c. o salário líquido.
        d. calcule os descontos e o salário líquido, conforme a tabela
        abaixo:
            Salário Bruto : R$
            IR (11%) : R$
            INSS (8%) : R$
            Sindicato ( 5%) : R$
        Obs.: Salário Bruto - Descontos = Salário Líquido.
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quanto você ganha por hora: ");
        float valorHora = teclado.nextFloat();
        
        System.out.print("Quantas horas você trabalha por mês: ");
        float horasMes = teclado.nextFloat();
        
        float salarioBruto = valorHora * horasMes;
        float impostoRenda = (11f / 100f) * salarioBruto;
        float inss = (8f / 100f) * salarioBruto;
        float sindicato = (5f / 100f) * salarioBruto;
        float salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;
        
        System.out.println("Salário bruto: R$" + salarioBruto);
        System.out.println("Desconto Imposto de Renda(11%): R$" + impostoRenda);
        System.out.println("Desconto INSS(8%): R$" + inss);
        System.out.println("Desconto Sindicato(5%): R$" + sindicato);
        System.out.println("Salário Líquido: R$" + salarioLiquido);
    }
}