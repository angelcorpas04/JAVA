import java.time.LocalDateTime;

public class Pajaro extends Mascota {
    public Pajaro(){
        super();
    }
    public Pajaro(String nombre, LocalDateTime fechaNacimiento, String microchip, String nombreDuenio){
        super(nombre, fechaNacimiento, microchip, nombreDuenio);
    }

    public String volar(){
        return "Volando...";
    }

    public String onomatopeyar(){
        return /*super.onomatopeyar() +*/ "Pio! Pio!";
    }
    
    public String toString(){
        return "El pájaro: " + super.toString();
    }
}
