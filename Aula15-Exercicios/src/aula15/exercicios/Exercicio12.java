package aula15.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio12 {

    public static void main(String[] args) {

        /*
        12. Faça um programa para o cálculo de uma folha de pagamento,
        sabendo que os descontos são do Imposto de Renda, que depende do 
        salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
        FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
        a empresa que deposita). O Salário Líquido corresponde ao Salário
        Bruto menos os descontos. O programa deverá pedir ao usuário o
        valor da sua hora e a quantidade de horas trabalhadas no mês.
        o Desconto do IR:
        o Salário Bruto até 900 (inclusive) - isento
        o Salário Bruto até 1500 (inclusive) - desconto de 5%
        o Salário Bruto até 2500 (inclusive) - desconto de 10%
        o Salário Bruto acima de 2500 - desconto de 20% 
        Imprima na tela as informações, dispostas conforme o exemplo abaixo. No
        exemplo o valor da hora é 5 e a quantidade de hora é 220.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora: ");
        float valorHora = teclado.nextFloat();

        System.out.print("Digite a quantidade de horas trabalhadas por mês: ");
        float horasMes = teclado.nextFloat();

        float salarioBruto = valorHora * horasMes;
        float fgts = (salarioBruto * 11) / 100;
        float inss = (salarioBruto * 10) / 100;

        System.out.println("Salário bruto: R$" + salarioBruto);

        if (salarioBruto <= 900) {

            float salarioLiquido = salarioBruto - inss;

            System.out.println("INSS (10%): R$" + inss);
            System.out.println("FGTS (11%): R$" + fgts);
            System.out.println("Salário liquido: R$" + salarioLiquido);

        } else if (salarioBruto <= 1500) {

            float impostoRenda = (salarioBruto * 5) / 100;
            float salarioLiquido = salarioBruto - impostoRenda - inss;

            System.out.println("Imposto de renda (5%): R$" + impostoRenda);
            System.out.println("INSS (10%): R$" + inss);
            System.out.println("FGTS (11%): R$" + fgts);
            System.out.println("Salário liquido: R$" + salarioLiquido);

        } else if (salarioBruto <= 2500) {

            float impostoRenda = (salarioBruto * 10) / 100;
            float salarioLiquido = salarioBruto - impostoRenda - inss;

            System.out.println("Imposto de renda (10%): R$" + impostoRenda);
            System.out.println("INSS (10%): R$" + inss);
            System.out.println("FGTS (11%): R$" + fgts);
            System.out.println("Salário liquido: R$" + salarioLiquido);

        } else if (salarioBruto > 2500) {

            float impostoRenda = (salarioBruto * 20) / 100;
            float salarioLiquido = salarioBruto - impostoRenda - inss;

            System.out.println("Imposto de renda (20%): R$" + impostoRenda);
            System.out.println("INSS (10%): R$" + inss);
            System.out.println("FGTS (11%): R$" + fgts);
            System.out.println("Salário liquido: R$" + salarioLiquido);

        }
    }
}
