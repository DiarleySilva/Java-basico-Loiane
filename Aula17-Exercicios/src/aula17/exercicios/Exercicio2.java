package aula17.exercicios;

import java.util.Scanner;

/**
 * @author Diarley Silva Santos
 */
public class Exercicio2 {

    public static void main(String[] args) {

        /*
        2. Faça um programa que leia um nome de usuário e a sua senha e não
        aceite a senha igual ao nome do usuário, mostrando uma mensagem
        de erro e voltando a pedir as informações.
         */
        
        Scanner teclado = new Scanner(System.in);

        boolean validacao = false;
        String nomeUsuario, senha;

        do {

            System.out.print("Digite seu nome de usuário: ");
            nomeUsuario = teclado.next();

            System.out.print("Digite sua senha: ");
            senha = teclado.next();

            if (nomeUsuario.equalsIgnoreCase(senha)) {
                System.out.println("A senha não pode ser igual ao nome de usuário. Tente novamente.");
                //validacao = false;
            } else {
                System.out.println("Nome de usuário: " + nomeUsuario);
                System.out.println("Senha: " + senha);
                validacao = true;
            }

        } while (!validacao);
    }
}