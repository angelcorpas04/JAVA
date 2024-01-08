import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 5;
        // int numEleccion;
        // String palabra;

        // if (numero<5){
        //     System.out.println("El número es menor que 5...");
        // } else if (numero == 5){
        //     System.out.println("El número es 5...");
        // } else {
        //     System.out.println("El número es mayor que 5...");
        // }

        
        // System.out.println("Introduce un número: ");
        // numEleccion = sc.nextInt();

        // if (numEleccion >= 0){
        //     System.out.println(numEleccion + " es positivo");
        // } else {
        //     System.out.println(numEleccion + " es negativo");
        // }

        // sc.nextLine();
        // System.out.println("Introduce una palabra y la repito: ");
        // palabra = sc.nextLine();
        // System.out.println(palabra);

        numero = Integer.parseInt(args[0]);
        if (numero >= 0){
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }
    }
}
