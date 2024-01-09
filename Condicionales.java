import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int numero = 5;
        // int numero1, numero2;
        // int numEleccion;
        int numero3;
        String palabra;

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
        
        // if (args.length >= 1){
        //     numero = Integer.parseInt(args[0]);
        // } else {
        //     System.out.println("Introduce un número: ");
        //     numero = sc.nextInt();
        // }

        // numero = Integer.parseInt(args[0]);
        // if (numero >= 0){
        //     System.out.println(numero + " es positivo");
        // } else {
        //     System.out.println(numero + " es negativo");
        // }
        
        // Cual es el número mayor:
        // if (args.length >= 2){
        //     System.out.println("Introduce dos números separados por un espacio: ");
        //     numero1 = sc.nextInt();
        //     numero2 = sc.nextInt();
        // } else {
        //     numero1 = Integer.parseInt(args[0]);
        //     numero2 = Integer.parseInt(args[1]);
        // }

        // if (numero1 > numero2){
        //     System.out.println(numero1 + " es mayor");
        // } else if (numero2 > numero1) {
        //     System.out.println(numero2 + " es mayor");
        // }
        // else {
        //     System.out.println("Son iguales");
        // }

        // En que día/mes estamos:
        // if (args.length < 1){
        //     System.out.println("Introduce 'dia' o 'mes': ");
        //     palabra = sc.nextLine();
        // } else {
        //     palabra = args[0];
        // }

        // if (palabra.equals("dia")){
        //     System.out.println("Es martes");
        // } else if (palabra.equals("mes")){
        //     System.out.println("Estamos en enero");
        // } else {
        //     System.out.println("Introduce una palabra válida...");
        // }

        // System.out.println("Introduce un número: ");
        // numero3 = sc.nextInt();

        // if (numero3 == 1){
        //     System.out.println("Es lunes...");
        // } else if (numero3 == 2){
        //     System.out.println("Es martes...");
        // } else if (numero3 == 3){
        //     System.out.println("Es miércoles...");
        // } else if (numero3 == 4){
        //     System.out.println("Es jueves...");
        // } else if (numero3 == 5){
        //     System.out.println("Es viernes...");
        // } else {
        //     System.out.println("Otro...");
        // }

        // SWITCH-CASE:
        // switch (numero3) {
        //     case 1:
        //         System.out.println("Es lunes...");
        //         break;
        //     case 2:
        //         System.out.println("Es martes...");
        //         break;
        //     case 3:
        //         System.out.println("Es miércoles...");
        //         break;
        //     case 4:
        //         System.out.println("Es jueves...");
        //         break;
        //     case 5:
        //         System.out.println("Es viernes...");
        //         break;
        //     case 6:
        //         System.out.println("Es sábado...");
        //         break;
        //     case 7:
        //         System.out.println("Es domingo...");
        //         break;
        
        //     default:
        //         System.out.println("Error 404...");
        //         break;
        // }

        // System.out.println("Introduce tu nota: ");
        // numero3 = sc.nextInt();

        // switch (numero3) {
        //     case 0:
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:
        //         System.out.println("Estás suspenso...");
        //         break;
        //     case 5:
        //         System.out.println("Suficiente...");
        //         break;
        //     case 6:
        //         System.out.println("Bien...");
        //         break;
        //     case 7:
        //     case 8:
        //         System.out.println("Notable...");
        //         break;
        //     case 9:
        //     case 10:
        //         System.out.println("Sobresaliente...");
        //         break;
        
        //     default:
        //         System.out.println("Error 404...");
        //         break;
        // }

        System.out.println("Introduce un dia de la semana: ");
        palabra = sc.nextLine();

        switch (palabra) {
            case "lunes" -> System.out.println("Es el día 1...");
            case "martes" -> System.out.println("Es el día 2...");
            case "miércoles" -> System.out.println("Es el día 3...");
            case "jueves" -> System.out.println("Es el día 4...");
            case "viernes" -> System.out.println("Es el día 5...");
            case "sábado" -> System.out.println("Es el día 6...");
            case "domingo" -> System.out.println("Es el día 7...");
            default -> System.out.println("Error 404...");
        }
    
    }
}
