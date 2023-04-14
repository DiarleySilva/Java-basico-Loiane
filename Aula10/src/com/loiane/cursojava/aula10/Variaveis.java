package com.loiane.cursojava.aula10;

/**
 * @author diarley
 */
public class Variaveis {

    public static void main(String[] args) {
        
        // São aceitas pela convenção
        int idade = 23;
        String nome = "Diarley";
        String nomeDoMeuCachorro = "Rex";
        String ano2023 = "2023";
        
        /*
        São aceitas, mas não são usadas pela convenção
        
        int _idade;
        int $idade;
        String ano2014;
        
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;
        */
        
        // idade = 25;
        
        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);
        System.out.println("Nome do cachorro = " + nomeDoMeuCachorro);
        System.out.println("Ano = " + ano2023);
        
        // Más práticas para nomear variáveis
        int a = 10;
        String b = "Diarley";
    }
}