import java.util.Scanner;
import java.util.Random;

public class GenerarNumerosAleatorios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Random rand = new Random();

        int numero;
        double numero2;

        // FORMA 1:
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

        // FORMA 2:
        // NÚMERO ALEATORIO ENTRE 0 Y 1
        numero2 = Math.random();
        System.out.println(numero2);

        // NÚMERO ALEATORIO ENTRE 0 Y 20 CON DECIMALES
        numero2 = Math.random()*20;
        System.out.println(numero2);

        // NÚMERO ALEATORIO ENTRE 0 Y 20
        numero2 = Math.floor(Math.random()*20);
        System.out.println(numero2);

        // NÚMERO ALEATORIO ENTRE 0 Y 20
        numero = (int)Math.floor(Math.random()*20);
        System.out.println(numero);

        // NÚMERO ALEATORIO ENTRE 5 Y 20
        int minimo = 5;
        int maximo = 20;
        int diferencia = maximo-minimo;
        numero = (int)Math.floor((Math.random()*diferencia)+minimo);
        System.out.println(numero);
    }
}
