import java.util.Scanner;

public class EjerciciosJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String letraString;
        char letra;

        // 1. Solicita por consola un número natural. Vuelve a solicitar el número hasta que efectivamente sea un número natural.
        do{
            System.out.println("Introduce un número natural: ");
            numero = sc.nextInt();
        }while(numero<0);

        // 2. Solicita un número entre 0 y 100. Asegurate de que está comprendido entre 0 y 100.
        do{
            System.out.println("Introduce un número entre 0 y 100: ");
            numero = sc.nextInt();
        }while(numero<0 || numero>100);

        sc.nextLine();

        // 3. Solicita una letra. Asegurate de que es una letra.
        System.out.println("Introduce una letra: ");
        letraString = sc.nextLine();

        letra = letraString.charAt(0);
        System.out.println(letra);

        if(letra >= 'a' && letra <= 'z'){
            System.out.println("Es una letra");
        }

        do{
            System.out.println("Introduce una letra: ");
            letra = sc.nextLine().charAt(0);
        }while(!(letra >= 'a' && letra <= 'z'));
    }
}
