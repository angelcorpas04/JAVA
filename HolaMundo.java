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
        System.out.print("Utilizando print...");
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
        System.out.println("El número, de tipo int, es " + numeroInt + ".");
        double numeroDouble = 5/2.0;
        numeroDouble = 5/2.0f;
        System.out.println("El número, de tipo double, es " + numeroDouble + ".");
        float numeroFloat = 5/2.0f;
        System.out.println("El número, de tipo float, es " + numeroFloat + ".");
    }
}