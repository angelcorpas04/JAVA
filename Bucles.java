import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = "";
        int numero;
        // boolean salir = false;

        // For each -> for num in listaNum:
        String[] listaAzules = {"Azul","Añil","Indigo","Cobalto","Klein","Celeste"};
        for (String azul : listaAzules){
            System.out.println(azul);
        }

        // For -> No existe en Python...
        // for (inicializamos variables; condición while; de cuánto en cuánto va aumentando)
        for (int contador = 0 ; contador < 10 ; contador++){
            System.out.println(contador);
        }

        // i de iterador:
        for (int i = 0 ; i < 10 ; i++){
            System.out.println(i);
        }

        // Recorrer una lista con bucle no-each:
        for (int i = 0 ; i < listaAzules.length ; i++){
            System.out.println(listaAzules[i]);
        }

        // Bucles for anidados:
        for (int i = 0 ; i < 4 ; i++){
            for (int j = 0 ; j < 10 ; j++){
                System.out.print("" + i + j + " ");
            }
            System.out.println();
        }

        // Bucles while:
        int contador = 5; 
        while (contador < 10){
            System.out.println(contador);
            contador++; 
        }
        
        while(!palabra.equals("salir")){
            System.out.println("Escribe salir: ");
            palabra = sc.nextLine();
        }

        // Bucle for como while
        // OJO -> Con los huequitos en el for...
        for( palabra = "" ; palabra.equals("salir") ;){ 
            System.out.println("Escribe salir: ");
            palabra = sc.nextLine();
        }

        // Bucles doWhile
        do{
            System.out.println("Escribe salir: ");
            palabra = sc.nextLine();
        }while (!palabra.equals("salir"));

        do{
            System.out.println("Introduce un número del 1 al 50: ");
            numero = sc.nextInt();
        }while (numero<1 || numero>50);
    }
}
