package PTs;

import java.util.Scanner;
import java.util.ArrayList;

// Este es el código necesario para obtener un 10 de calificación. 
// Existen mejoras, toma de decisiones y ejercicios extra que pueden llevar a la misma nota o superior sin que el código sea exactamente igual.

public class ComidaRapida {

    public static String construirHamburguesa(){
        Scanner sc = new Scanner(System.in);

        String comidaFinal = "Has elegido Hamburguesa: ";
        String opcion;

        System.out.println("¿Quieres que tenga lechuga? Si/No: ");
        opcion =sc.nextLine();
        if (opcion.equals("Si")) comidaFinal += "con lechuga ";

        System.out.println("¿Quieres que tenga tomate? Si/No: ");
        opcion =sc.nextLine();
        if (opcion.equals("Si")) comidaFinal += "con tomate ";

        System.out.println("¿Quieres que tenga mahonesa? Si/No: ");
        opcion =sc.nextLine();
        if (opcion.equals("Si")) comidaFinal += "con mahonesa";

        return comidaFinal;
    }

    public static String construirPizza(){
        Scanner sc = new Scanner(System.in);

        String comidaFinal = "Has elegido Pizza: ";
        String opcion;

        System.out.println("¿Quieres que tenga salsa? Si/No: ");
        opcion =sc.nextLine();
        if (opcion.equals("Si")) comidaFinal += "con salsa ";

        System.out.println("¿Quieres que tenga extra de queso? Si/No: ");
        opcion =sc.nextLine();
        if (opcion.equals("Si")) comidaFinal += "con extra de queso ";

        return comidaFinal;
    }

    public static String construirHelado(){
        Scanner sc = new Scanner(System.in);

        String comidaFinal = "Has elegido Helado: ";
        String opcion;

        System.out.println("¿Quieres que tenga chispitas? Si/No: ");
        opcion =sc.nextLine();
        if (opcion.equals("Si")) comidaFinal += "con chispitas ";

        System.out.println("¿Quieres que tenga sirope? Si/No: ");
        opcion =sc.nextLine();
        if (opcion.equals("Si")) comidaFinal += "con sirope ";

        System.out.println("¿Quieres que sea cucurucho o tarrina? Cucurucho/Tarrina: ");
        opcion =sc.nextLine();
        if (opcion.equals("Tarrina")) comidaFinal += "con tarrina.";
        else comidaFinal += "con cucurucho.";

        return comidaFinal;

    }

    public static void mostrarLista(ArrayList<String> lista){
        System.out.println("\nVa a comprar: ");
        for(int i = 0 ; i < lista.size() ; i++){
            System.out.println(i + ": " + lista.get(i));
        }
        System.out.println("\nSon " + lista.size() + " productos.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaComida = new ArrayList<String>();

        String comida = "", comidaConstruida = "";

        while(!comida.equals("SALIR")){
            System.out.println("¿Qué quieres comer? Hamburguesa, Pizza o Helado: ");
            comida = sc.nextLine();

            switch(comida){
                case "Hamburguesa" -> comidaConstruida = construirHamburguesa();
                case "Pizza" -> comidaConstruida = construirPizza();
                case "Helado" -> comidaConstruida = construirHelado();
                default -> comidaConstruida = "";
            }

            if (!comidaConstruida.equals("")) listaComida.add(comidaConstruida);

        }
        mostrarLista(listaComida);

    }
}
