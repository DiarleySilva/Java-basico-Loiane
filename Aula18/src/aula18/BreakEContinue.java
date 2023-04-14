package aula18;

import java.util.Scanner;

/**
 * @author Diarley Silva Santos
 */
public class BreakEContinue {

    public static void main(String[] args) {

        /*
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();
        
        System.out.print("Digite um segundo número: ");
        int maximo = teclado.nextInt();
        
        for (int i = numero; i <= maximo; i++) {
            
            System.out.println(i);
            
            if (i % 7 == 0) {
                System.out.println("Valor de i: " + i);
                break;
            }
        }
         */
        
        // Rotulos ou labels
        
        /*
        for (int i = 0; i <= 4; i++) {

            rotulo1:
            {
                rotulo2:
                {
                    rotulo3:
                    {
                        if (i == 1) {
                            break rotulo1;
                        }
                        if (i == 2) {
                            break rotulo2;
                        }
                        if (i == 3) {
                            break rotulo3;
                        }
                        System.out.println("Rotulo 3");
                    }
                    System.out.println("Rotulo 2");
                }
                System.out.println("Rotulo 1");
            }
            System.out.println(i);
        }
         */
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        System.out.print("Digite um segundo número: ");
        int maximo = teclado.nextInt();

        for (int i = numero; i <= maximo; i++) {

            if (i % 7 == 0) {
                continue;
            }
            System.out.println("Valor de i: " + i);
        }
    }
}