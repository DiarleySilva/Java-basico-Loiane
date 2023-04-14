package aula16;

/**
 * @author diarley
 */
public class Aula16 {

    public static void main(String[] args) {

        int contador = 1; // iniciando em 1
        int maximo = 10;

        System.out.println("Contando até " + maximo);

        while (contador <= maximo) {
            System.out.println("Valor atual: " + contador);
            contador++; // contador = contador + 1 ou contador += 1
        }

        System.out.println("Valor atual do contador: " + contador);

        do {
            contador++;
            System.out.println("Valor do contador: " + contador);
        } while (contador < 15);

        System.out.println("Valor atual do contador: " + contador);
    }
}