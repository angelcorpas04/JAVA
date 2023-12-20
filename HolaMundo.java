import java.util.Scanner;
// # print("Hola Mundo")
// 1º Compilar: javac nombreArchivo.java
// 2º Interpretar: java nombreArchivo

public class HolaMundo {
    public static void main (String[] args){
        if (args.length == 1){
            System.out.println("Hola "+ args[0] + "!");
        }else{
            System.out.println("Hola Mundo!!!");
        }
        // Diferencia entre print y println:
        System.out.print("\nUtilizando print...");
        System.out.println("Después del print...");
        System.out.println("Utilizando println...");
        System.out.println("Después del println...");
        System.out.println("\nUtilizando\nsaltos\nde\nlínea\ncon\n\\n\n");

        // Hacer operaciones en el print:
        System.out.print("3+3: ");
        System.out.println(3+3);
        System.out.println("3+3: " + (3+3) );
        System.out.println("3+3: " + 3+3 );
        System.out.println("3*3: " + (3*3) );
        System.out.println("'3'*'3': " + ('3'*'n') );

        // La declaración de variables se hace al principio del código
        int numeroInt = 5/2;
        System.out.println("\nEl número, de tipo int, es " + numeroInt + ".");
        double numeroDouble = 5/2.0;
        numeroDouble = 5/2.0f;
        System.out.println("El número, de tipo double, es " + numeroDouble + ".");
        float numeroFloat = 5/2.0f;
        System.out.println("El número, de tipo float, es " + numeroFloat + ".");

        int letraInt;
        char letra = 'a';
        System.out.println("\nLetra: " + letra);
        letra = 65; // A en ASCII
        System.out.println("Letra: " + letra);
        letraInt = 66;
        // letra = letraInt;
        letra = (char)letraInt;
        System.out.println("Letra: " + letra);
        letraInt = letra;
        System.out.println("Letra: " + letraInt);
        letra += 5;
        System.out.println("Letra: " + letra);

        // De string a entero
        System.out.println("\n--- CASTEANDO ---");
        int numeroInt1 = 2;
        float numeroFloat1;
        double numeroDouble1;
        String numeroString;

        numeroFloat1 = numeroInt1;
        numeroDouble1 = numeroInt1;
        System.out.println("Int: " + numeroInt1 + "\nDouble: " + numeroDouble1 + "\nFloat: " + numeroFloat1);
        numeroDouble1 = numeroFloat1;
        System.out.println("Int: " + numeroInt1 + "\nDouble: " + numeroDouble1 + "\nFloat: " + numeroFloat1);

        System.out.println("\nConversión de int a double/float");
        numeroInt1 = 1;
        numeroFloat1 = 2.25f;
        numeroDouble1 = 3.75;
        numeroFloat1 = (float)numeroDouble1;
        numeroInt1 = (int)numeroDouble1;
        System.out.println("Int: " + numeroInt1 + "\nDouble: " + numeroDouble1 + "\nFloat: " + numeroFloat1);

        System.out.println("\nConversión int-string");
        numeroInt1 = 1;
        numeroString = "10";
        System.out.println("Int: " + numeroInt1 + "\nString: " + numeroString);
        // ERROR numeroInt1 = numeroString;
        // ERROR numeroInt1 = (int)numeroString;
        numeroInt1 = Integer.parseInt(numeroString);
        // numeroString = numeroInt1
        System.out.println("Int: " + numeroInt1 + "\nString: " + numeroString);
        numeroString = String.valueOf(numeroInt1);
        System.out.println("Int: " + numeroInt1 + "\nString: " + numeroString);

        System.out.println("\n--- Conversión double-string ---");
        numeroDouble1 = 1;
        numeroString = "10";
        System.out.println("Int: " + numeroDouble + "\nString: " + numeroString);
        numeroInt1 = Integer.parseInt(numeroString);
        System.out.println("Int: " + numeroDouble + "\nString: " + numeroString);

        numeroString = "" + numeroDouble1;

        System.out.println("\n--- Declaración de variables ---");
        int x, y, z;
        x = 10;
        y = 20;
        z = 30;
        System.out.println(x + " - " + y + " - " + z);

        int a = 10, b = 20, c = 30;
        System.out.println(a + " - " + b + " - " + c);

        System.out.println("\n--- Declaración de variables CONSTANTES ---"); // No se pueden cambiar
        final int TAMA_MAX = 100;
        final String PALABRA_FINAL = "HOLA";
        System.out.println("final int: " + TAMA_MAX + "\nfinal string: " + PALABRA_FINAL);

        System.out.println("\n--- Input - SCANNER ---");
        Scanner sc = new Scanner(System.in);
        String palabra;
        int numero;
        System.out.println("Introduce una palabra: ");
        palabra = sc.nextLine();
        System.out.println(palabra);
        System.out.println("Introduce un número: ");
        numero = sc.nextInt();
        System.out.println(numero);

        System.out.println("\n--- Tipos de datos: BOOLEAN ---");
        boolean esFacil = true;
        boolean esBonito = true;
        System.out.println("¿Es fácil? " + esFacil);
        System.out.println("¿Es fácil? " + !esFacil);
        System.out.println(esFacil && esBonito);

        System.out.println("\n---  ---");
    }
}