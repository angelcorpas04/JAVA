import java.time.LocalDateTime;

public class Gato extends Mascota{
    
    public Gato(){
        super();
    }
    public Gato(String nombre, LocalDateTime fechaNacimiento, String microchip, String nombreDuenio, String raza){
        super(nombre, fechaNacimiento, microchip, nombreDuenio);
    }

    public String onomatopeyar(){
        return super.onomatopeyar() + ": Miau! Miau!";
    }
    public String pasear(){
        return "Paseando...";
    }

    public String toString(){
        return "El gato: " + super.toString();
    }
    public static void main(String[] args) {
        Perro miPerro = new Perro();
        System.out.println(miPerro);
        System.out.println(miPerro.dormir());
        System.out.println(miPerro.onomatopeyar());
        System.out.println(miPerro.pasear());

        Mascota miMascota = new Mascota();
        System.out.println(miMascota.onomatopeyar());
        // System.out.println(miMascota.pasear());
    }
}
