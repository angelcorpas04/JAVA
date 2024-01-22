package PTs;
import java.util.ArrayList;
import java.util.Scanner;

public class PT202_ArrayList {
    public class Arrays {
        public static void imprimirArray(String[] lista) {
            System.out.println("Aqui tienes tu lista de Strings:");
            for (String elemento : lista){
                System.out.println(elemento);
            }
        }
        public static void imprimirArray(int[] lista) {
            System.out.println("Aqui tienes tu lista de enteros:");
            for (int elemento : lista){
                System.out.println(elemento);
            }
        }
        public static void imprimirArray(char[] lista) {
            System.out.println("Aqui tienes tu lista de letras:");
            for (char elemento : lista){
                System.out.println(elemento);
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numIntegrantes;
            String nombreEquipo;
            // String nombresIntegrantes = "";
            ArrayList<String> listaIntegrantes = new ArrayList<String>();
            String nombreIntegrante = "";
            int numJefe;
            String nombreJefe = "";

            // CASO #1.- 
            // Introduciendo, al ejecutar el sistema, 
            // el nombre del equipo y el número de miembros que lo 
            // componen. 
            // El nombre de los integrantes se debe solicitar a posteriori.

            if (args.length != 2){
                System.out.println("Versión del código en desarrollo... ¡Introduzca el nombre del equipo y el número de miembros!");
            }else{
                System.out.println("Ha introducido correctamente los datos.");
                nombreEquipo = args[0];
                numIntegrantes = Integer.parseInt(args[1]);

                

                for (int i = 0 ; i < numIntegrantes ; i++){
                    System.out.println("Introduce el nombre del integrante " + (i+1) + ": ");
                    nombreIntegrante = sc.nextLine();
                    listaIntegrantes.add(nombreIntegrante);
                    if (numJefe == i) nombreJefe = nombreIntegrante;
                }

                nombreJefe = nombreIntegrante.get(numJefe);
                numJefe = (int)Math.floor(Math.random()*numIntegrantes);

                System.out.println( "El equipo " + nombreEquipo + 
                                    " está compuesto por " + numIntegrantes + 
                                    " integrantes, a saber: " + listaIntegrantes + 
                                    "-> El jefe de equipo es " + nombreJefe) ;
            }
        }
    }
}
