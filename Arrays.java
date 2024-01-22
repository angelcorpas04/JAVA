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

        // ARRAYs DINÁMICAS (LISTA)
        // Creación de arrays dinámica
    }
}
