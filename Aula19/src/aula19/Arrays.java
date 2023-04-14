package aula19;

/**
 * @author Diarley Silva Santos
 */
public class Arrays {

    public static void main(String[] args) {
        
        /*
        float tempDiaria001 = 31f;
        float tempDiaria002 = 32f;
        float tempDiaria003 = 33f;
        float tempDiaria004 = 34f;
        float tempDiaria005 = 35f;
        */
        
        float[] tempDiaria = new float[365];
        tempDiaria[0] = 31f;
        tempDiaria[1] = 32f;
        tempDiaria[2] = 33f;
        tempDiaria[3] = 34f;
        tempDiaria[4] = 35f;
        
        System.out.println("Temperatura do dia 1: " + tempDiaria[0] + "°C");
        System.out.println("Tamanho do array: " + tempDiaria.length);
        System.out.println("Valores do array: " + tempDiaria); // Mostra o endereço da memória
        
        for (int i = 0; i < tempDiaria.length; i++) {
            System.out.println("Temperatura do dia " + (i + 1) + " é: " + tempDiaria[i] + "°C.");
        }
        
        // For melhorado
        
        for (float temperatura : tempDiaria) {
            System.out.println(temperatura);
        }
    }
}