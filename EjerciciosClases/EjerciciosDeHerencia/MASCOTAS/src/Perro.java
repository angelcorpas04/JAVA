import java.time.LocalDateTime;

public class Perro extends Mascota{
    private String raza;

    public Perro(){
        super();
        this.raza = "Chucho";
    }
    public Perro(String nombre, LocalDateTime fechaNacimiento, String microchip, String nombreDuenio, String raza){
        super(nombre, fechaNacimiento, microchip, nombreDuenio);
        this.raza = raza;
    }

    public String onomatopeyar(){
        return super.onomatopeyar() + ": Guau! Guau!";
    }
    public String pasear(){
        return "Paseando...";
    }

    public String toString(){
        return "El " + this.raza + ": " + super.toString();
    }
    public static void main(String[] args) {
        LocalDateTime fecha = LocalDateTime.now().minusYears(8);
        Perro miPerro = new Perro("Lata", fecha, "8903", "Paco", "chucho");
        System.out.println(miPerro);
        System.out.println(miPerro.dormir());
        System.out.println(miPerro.onomatopeyar());
        System.out.println(miPerro.pasear());

        Mascota miMascota = new Mascota();
        System.out.println(miMascota.onomatopeyar());
        // System.out.println(miMascota.pasear());
    }
}
