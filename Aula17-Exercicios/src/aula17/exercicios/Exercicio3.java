package aula17.exercicios;

import java.util.Scanner;

/**
 * @author Diarley Silva Santos
 */
public class Exercicio3 {

    public static void main(String[] args) {

        /*
        3. Faça um programa que leia e valide as seguintes informações:
            a. Nome: maior que 3 caracteres;
            b. Idade: entre 0 e 150;
            c. Salário: maior que zero;
            d. Sexo: 'f' ou 'm';
            e. Estado Civil: 's', 'c', 'v', 'd';
         */
        Scanner teclado = new Scanner(System.in);

        boolean validacao = false;
        String nome, sexo, estadoCivil;
        int idade, salario;

        do {

            System.out.print("Digite seu nome: ");
            nome = teclado.next();

            if (nome.length() > 3) {
                validacao = true;
            } else {
                System.out.println("O nome não pode ser menor que 3 caracteres. Tente novamante.");
            }
        } while (!validacao);
        
        validacao = false;

        do {

            System.out.print("Digite sua idade: ");
            idade = teclado.nextInt();

            if (idade > 0 && idade < 150) {
                validacao = true;
            } else {
                System.out.println("A idade deve estar entre 0 e 150. Tente novamante.");
            }
        } while (!validacao);
        
        validacao = false;

        do {

            System.out.print("Digite seu salário: ");
            salario = teclado.nextInt();

            if (salario > 0) {
                validacao = true;
            } else {
                System.out.println("O salário precisar ser maior que 0. Tente novamante.");
            }
        } while (!validacao);
        
        validacao = false;

        do {

            System.out.print("Digite seu sexo: ");
            sexo = teclado.next();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                validacao = true;
            } else {
                System.out.println("Digite f para FEMININO ou m para MASCULINO. Tente novamante.");
            }
        } while (!validacao);
        
        validacao = false;

        do {

            System.out.print("Digite seu estado civil (s, c. v, d): ");
            estadoCivil = teclado.next();

            if (estadoCivil.equalsIgnoreCase("s")
                    || estadoCivil.equalsIgnoreCase("c")
                    || estadoCivil.equalsIgnoreCase("v")
                    || estadoCivil.equalsIgnoreCase("d")) {
                validacao = true;
            } else {
                System.out.println("Estado civil inválido. Tente novamante.");
            }
        } while (!validacao);
        
        System.out.println("Informações coletadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$" + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);
        System.out.println("\nInformações válidas.");
    }
}