
package maquinadebolas;

public class Juguete {
    private String nombre;
    private double precio;
    
    public Juguete() {
        this.nombre = "Juguete";
        this.precio = 1.0;
    }
    public Juguete(String nombre) {
        this.nombre = nombre;
        // Ponemos de precio máximo 0,5 porque es el precio mínimo que tienen las bolas.
        // De esta forma nos aseguramos que al menos las cinco primeras bolas tienen un margen de beneficio máximo.
        // No es la única opción posible.
        this.precio = this.generarPrecioJuguete(0.5); 
    }
    public Juguete(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double generarPrecioJuguete(double precioMaximo) {
        // Math.random()*(maximo-minimo)+minimo;
        return Math.random()*(precioMaximo-0.2)+0.2;
    }

    @Override
    public String toString() {
        return this.nombre + " -> " + precio + '€';
    }
    
    public static void main(String[] args) {
        Juguete jugueteDefecto = new Juguete();
        Juguete jugueteCompleto = new Juguete("miJuguete", 0.65);
        Juguete jugueteNombre = new Juguete("miJugete");
        
        System.out.println(jugueteDefecto);
        System.out.println(jugueteCompleto);
        System.out.println(jugueteNombre);
    }
}
