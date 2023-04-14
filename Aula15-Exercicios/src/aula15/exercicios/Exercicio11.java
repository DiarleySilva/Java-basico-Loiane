package aula15.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio11 {
    
    public static void main(String[] args) {
        
        /*
        11. As Organizações Tabajara resolveram dar um aumento de salário aos
        seus colaboradores e lhe contraram para desenvolver o programa que
        calculará os reajustes.
        Faça um programa que recebe o salário de um colaborador e o
        reajuste segundo o seguinte critério, baseado no salário atual:
        o salários até R$ 280,00 (incluindo) : aumento de 20%
        o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
        o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
        o salários de R$ 1500,00 em diante : aumento de 5% Após o
        aumento ser realizado, informe na tela:
        o o salário antes do reajuste;
        o o percentual de aumento aplicado;
        o o valor do aumento;
        o o novo salário, após o aumento.
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o seu saĺário para reajuste: ");
        float salario = teclado.nextFloat();
        
        if (salario < 280) {
            
            float reajuste = (20 * salario) / 100;
            
            System.out.println("Salário antes do reajuste: " + salario);
            System.out.println("Aumento de 20%.");
            System.out.println("Valor aumentado: R$" + reajuste);
            System.out.println("Salário atual: R$" + (salario + reajuste));
            
        } else if (salario >= 280 && salario < 700) {
            
            float reajuste = (15 * salario) / 100;
            
            System.out.println("Salário antes do reajuste: " + salario);
            System.out.println("Aumento de 15%.");
            System.out.println("Valor aumentado: R$" + reajuste);
            System.out.println("Salário atual: R$" + (salario + reajuste));
            
        } else if (salario >= 700 && salario < 1500) {
            
            float reajuste = (10 * salario) / 100;

            System.out.println("Salário antes do reajuste: " + salario);
            System.out.println("Aumento de 10%.");
            System.out.println("Valor aumentado: R$" + reajuste);
            System.out.println("Salário atual: R$" + (salario + reajuste));
            
        } else if (salario > 1500) {
            
            float reajuste = (5 * salario) / 100;

            System.out.println("Salário antes do reajuste: " + salario);
            System.out.println("Aumento de 5%.");
            System.out.println("Valor aumentado: R$" + reajuste);
            System.out.println("Salário atual: R$" + (salario + reajuste));
        }
    }
}