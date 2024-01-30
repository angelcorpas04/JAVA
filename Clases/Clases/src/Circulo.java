// import java.util.Scanner;

/**
 * Define un círculo con su radio y su color
 * 
 * @author Ángel Corpas
 * @version 1.0
 */

/**
 * Atributos
 * Constructores
 * Get
 * Set
 * ToString
 */

public class Circulo {
    
    // Atributos de la clase
    private int radio = 5;
    private String color;

    // Métodos de la clase

    /**
     * Constructor por defecto
     * Crea un círculo blanco con radio 1.
     */
    public Circulo(){
        this.radio = 1;
        this.color = "Blanco";
    }

    /**
     * Constructor con parámetros
     * Crea un círculo con un radio y un color especificados
     * @param radio El radio del círculo
     * @param color El color del círculo
     * @see Circulo#setRadio(int radio)
     */
    public Circulo(int radio, String color){
        this.setRadio(radio);
        this.color = color;
    }
    
    /**
     * Constructor de copia
     * Crea un círculo con un radio y color obtenido a partir de otro círculo
     * @param c El círculo a copiar
     */
    public Circulo(Circulo c){
        this.radio = c.radio;
        this.color = c.color;
    }

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

    /**
     * Establece el radio del círculo
     * En caso de que el radio sea menor que (0), lo establece a 1
     * @param radio El nuevo radio del círculo
     */
    public void setRadio(int radio){
        this.radio = radio;
        if (radio <= 0) this.radio = radio;
    }

    /**
     * Establece el color del círculo
     * @param color El nuevo color del círculo
     */
    public void setColor(String color){
        this.color = color;
    }

    /**
     * Calcular el área del círculo
     * @return area El área del círculo
     */
    public double calcularArea(){
        return Math.PI*this.radio*this.radio; // Math.pow(this.radio,2)
    }

    /**
     * Calcular el perímetro del círculo
     * @return perímetro El perímetro del círculo
     */
    public double calcularPerimetro(){
        return 2*Math.PI*this.radio;
    }

    /**
     * Devuelve la representación en formato de cadena (String) del objeto círculo.
     * @return Una cadena que representa el objeto círculo.
     */
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

        System.out.println("El área de circulitoDeCopia [" + circulitoDeCopia + "] es " + circulitoDeCopia.calcularArea());
        System.out.println("El perímetro de circulitoDeCopia [" + circulitoDeCopia + "] es " + circulitoDeCopia.calcularPerimetro());
    }
    
}