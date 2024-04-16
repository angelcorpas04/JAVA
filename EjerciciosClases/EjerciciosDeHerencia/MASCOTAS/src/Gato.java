import java.time.LocalDateTime;

public class Gato extends Mascota{
    
    public Gato(){
        super();
    }
    public Gato(String nombre, LocalDateTime fechaNacimiento, String microchip, String nombreDuenio){
        super(nombre, fechaNacimiento, microchip, nombreDuenio);
    }

    public String onomatopeyar(){
        return /*super.onomatopeyar() +*/ "Miau! Miau!";
    }
    public String pasear(){
        return "Paseando...";
    }

    public String toString(){
        return "El gato: " + super.toString();
    }
}
