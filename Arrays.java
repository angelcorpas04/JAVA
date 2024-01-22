import java.util.ArrayList;

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
        // ARRAYs ESTÁTICAS (LISTA)
        // Creación de arrays estáticas
        String[] colores = {"Azul","Amarillo", "Rojo", "Verde"};
        String color;

        System.out.println(colores); // Para mostrarlas por pantalla saliendo los datos y no la direccion, tendriamos que hacer un bucle

        int[] numeros;
        numeros = new int[10]; // Array vacío en 10 huecos / Declarar y luego crear

        char[] letras = new char[10]; // Lo creamos durante la declaración.

        String[] colores2 = colores;
        System.out.println(colores2);
        
        colores[1] = "4m4rill0";

        imprimirArray(colores);
        imprimirArray(colores2);

        color = colores[0];
        System.out.println("El color que hay en la primera posición es: " + color);

        // Probamos la lista de numeros
        System.out.println("Imprimo números: ");
        System.out.println(numeros);
        imprimirArray(numeros);

        // Probamos la lista de letras
        System.out.println("Imprimo letras: ");
        System.out.println(letras);
        imprimirArray(letras);

        // El tamaño de la lista:
        System.out.println("La lista tiene " + colores.length + " elementos");

        // ARRAYs DINÁMICAS (LISTA)
        // Creación de arrays dinámica
        ArrayList<String> arrayColores = new ArrayList<String>();
        ArrayList<String> arrayColores2 = arrayColores;
        arrayColores.add("Azul");
        arrayColores.add("Amarillo");
        arrayColores.add("Rojo");
        arrayColores.add("Verde");
        arrayColores.add("Blanco");
        arrayColores.add("Negro");

        System.out.println("La lista tiene " + arrayColores.size() + " elementos");

        System.out.print("Imprimo el arrayList de colores:");
        System.out.println(arrayColores);
        System.out.print("Imprimo el arrayList de colores2:");
        System.out.println(arrayColores2);

        // Mostrar o recoger un valor del ArrayList:
        color = arrayColores.get(0);
        System.out.println("El color que hay en la primera posición es: " + color);

        // Cambiar un valor del ArrayList:
        arrayColores.set(1, "4m4rill0");
        System.out.print("Imprimo el arrayList de colores:");
        System.out.println(arrayColores);
        System.out.print("Imprimo el arrayList de colores2:");
        System.out.println(arrayColores2);

        // Eliminar elemento:
        arrayColores.remove(1);
        System.out.print("Imprimo el arrayList de colores eliminando un valor:");
        System.out.println(arrayColores);

        arrayColores.clear();
        System.out.print("Imprimo el arrayList de colores eliminando todo:");
        System.out.println(arrayColores);
    }
}
