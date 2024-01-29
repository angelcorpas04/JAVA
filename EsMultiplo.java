import java.util.Scanner;
import java.util.Random;

public class EsMultiplo {

    public static boolean esMultiplo(int num1, int num2) {
        return num1 % num2 == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        /*
         * Crea una función a la que le pases dos números y compruebe si el primero es
         * multiplo del segundo. True si es múltiplo.
         * False si no es múltiplo.
         * Generar bateria de pruebas con números aleatorios
         */

        // int[] listaNumeros = new int[2];    -> Tambien se puede hacer asi
        int num1,num2;
        int numAleatorio = rand.nextInt(10)+1;
        int[] listaNumeros = new int[numAleatorio];

        for (int i = 0 ; i < listaNumeros.length ; i++){
            listaNumeros[i] = rand.nextInt(30)+1;
        }

        if (args.length == 1 && args[0].equals("probando")) {
            int numero2 = listaNumeros[0];

            for (int i = 0; i < listaNumeros.length; i++) {
                int numero1 = listaNumeros[i];
                System.out.println(esMultiplo(numero1,numero2));
            }
        } else if (args.length != 2) {
            System.out.println("Lo siento, el numero de argumentos no es correcto, vuelve a introducirlos: ");

            System.out.println("Dime un numero: ");
            num1 = sc.nextInt();

            System.out.println("Dime otro numero: ");
            num2 = sc.nextInt();

        } else {
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
        }

    }
}