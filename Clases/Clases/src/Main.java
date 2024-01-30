import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> colorCirculos = new ArrayList<String>();
        ArrayList<Integer> radioCirculos = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        String colores;
        int radios;

        // Solicita 10 circulos y los mete en un ArrayList de Circulos
        // Muestra por pantalla los circulos introducidos
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("Escribe el color que quieres en tus circulos: ");
            colores = sc.nextLine();
            colorCirculos.add(colores);
        }
        
        System.out.println("Los colores que has introducido son: ");
        for (String elemento : colorCirculos){
            System.out.print(elemento + " ");
        }

        sc.nextLine();

        for (int i = 0 ; i < 10 ; i++){
            System.out.println("Escribe el radio que quieres en tus circulos: ");
            radios = sc.nextInt();
            sc.nextLine();
            radioCirculos.add(radios);
        }

        System.out.println("Los radios que has introducido son: ");
        for (int elemento : radioCirculos){
            System.out.print(elemento + " ");
        }
    }
}
