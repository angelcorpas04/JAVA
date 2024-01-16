import java.util.Scanner;
import java.util.Random;

public class GenerarNumerosAleatorios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numero;

        numero = rand.nextInt();
        System.out.println(numero);

        // NÚMERO ENTRE EL 0 Y EL 4
        numero = rand.nextInt(5);
        System.out.println(numero);

        // NÚMERO ENTRE EL 0 Y EL 5
        numero = rand.nextInt(5+1);
        System.out.println(numero);

        // NÚMERO ENTRE EL 1 Y EL 5
        numero = rand.nextInt(5)+1;
        System.out.println(numero);
    }
}
