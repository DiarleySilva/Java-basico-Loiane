package aula15.exercicios;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Exercicio23 {

    public static void main(String[] args) {

        /*
        O Hipermercado Tabajara está com uma promoção de carnes que é
        imperdível. Confira:
        Até 5 Kg
            File Duplo - R$ 4,90 por Kg
            Alcatra - R$ 5,90 por Kg
            Picanha - R$ 6,90 por Kg
        Acima de 5 Kg
            File Duplo - R$ 5,80 por Kg
            Alcatra - R$ 6,80 por Kg
            Picanha - R$ 7,80 por Kg
        Para atender a todos os clientes, cada cliente poderá levar
        apenas um dos tipos de carne da promoção, porém não há
        limites para a quantidade de carne por cliente. Se compra for
        feita no cartão Tabajara o cliente receberá ainda um desconto
        de 5% sobre o total a compra. Escreva um programa que peça
        o tipo e a quantidade de carne comprada pelo usuário e gere
        um cupom fiscal, contendo as informações da compra: tipo e
        quantidade de carne, preço total, tipo de pagamento, valor do
        desconto e valor a pagar.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Opções de carnes:\n1 - Filé Duplo\n2 - Alcatra\n3 - Picanha");

        System.out.print("Digite a opção desejada: ");
        byte numeroCarne = teclado.nextByte();

        System.out.print("Digite a quantidade em quilos(kg) de carne a ser comprada: ");
        float quantidadeCarne = teclado.nextFloat();

        float precoKg = 0;

        if (numeroCarne == 1) {

            System.out.println(quantidadeCarne + "Kg de Filé duplo.");

            if (quantidadeCarne < 5) {
                precoKg = 4.9f;
            } else {
                precoKg = 5.8f;
            }

        } else if (numeroCarne == 2) {

            System.out.println(quantidadeCarne + "Kg de Alcatra.");

            if (quantidadeCarne < 5) {
                precoKg = 5.9f;
            } else {
                precoKg = 6.8f;
            }

        } else if (numeroCarne == 3) {

            System.out.println(quantidadeCarne + "Kg de Picanha.");

            if (quantidadeCarne < 5) {
                precoKg = 6.9f;
            } else {
                precoKg = 7.8f;
            }
        }
        
        float precoTotal = quantidadeCarne * precoKg;
        System.out.println(quantidadeCarne + "Kg x R$" + precoKg + " por Kg = R$" + precoTotal);
        
        System.out.print("Deseja pagar com o cartão? Digite 1 para SIM, 0 para NÃO: ");
        byte cartao = teclado.nextByte();
        
        if (cartao == 1) {
            
            float desconto = (precoTotal / 100) * 5;
            System.out.println("Desconto de: R$" + desconto);
            System.out.println("Valor total a pagar: R$" + (precoTotal - desconto));
            
        } else {
            System.out.println("Valor total a pagar: R$" + precoTotal);
        }
    }
}