// import java.util.Scanner;

/**
 * Define un círculo con su radio y su color
 * 
 * @author Ángel Corpas
 * @version 1.0
 */

public class Circulo {
    
    // Atributos de la clase
    private int radio = 5;
    private String color;

    // Métodos de la clase
    // Constructor() -> Por defecto
    public Circulo(){
        this.radio = 1;
        this.color = "Blanco";
    }

    // Constructor(int radio, String color) -> Con parámetros
    public Circulo(int radio, String color){
        this.setRadio(radio);
        this.color = color;
    }
    
    // Constructor(Circulo c) -> De copia
    public Circulo(Circulo c){
        this.radio = c.radio;
        this.color = c.color;
    }

    // Get -> Conseguir la información de los atributos.
    /**
     * Obtener el radio actual del círculo
     * @return El radio del círculo
     */
    public int getRadio(){
        return this.radio;
    }

    /**
     * Obtener el color actual del círculo
     * @return El color del círculo
     */
    public String getColor(){
        return this.color;
    }

    // Set -> Establecer la información a los atributos
    /**
     * Establece el radio del cículo
     * @param radio
     */
    public void setRadio(int radio){
        this.radio = radio;
        if (radio <= 0) this.radio = radio;
    }

    public void setColor(String color){
        this.color = color;
    }

    // Siempre se tiene que llamar así porque Java asume que cuando queremos mostrar por pantall
    // un círculo (print) tiene qie llamar a to String
    public String toString(){
        return "El radio es " + this.radio + " y el color es " + this.color;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Circulo circulito = new Circulo();
        Circulo circulitoConParametros = new Circulo(2,"Azul");
        Circulo circulitoDeCopia = new Circulo(circulitoConParametros);

        System.out.println(circulito);
        System.out.println(circulitoConParametros);
        System.out.println(circulitoDeCopia);

        circulitoDeCopia.setColor("rojo");
        circulitoDeCopia.setRadio(5);

        System.out.println(circulitoDeCopia);
        System.out.println("¿El círculoPorDefecto tiene el mismo radio que el circuloDeCopia?");
        System.out.println(circulito.getRadio() == circulitoDeCopia.getRadio());

        
    }
    
}