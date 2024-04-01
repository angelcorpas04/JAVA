import java.time.LocalDateTime;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        LocalDateTime fecha = LocalDateTime.now().minusYears(8);
        Perro miPerro = new Perro("Lata", fecha, "8903", "Paco", "chucho");

        fecha = LocalDateTime.now().minusYears(2);
        fecha = fecha.plusMonths(5);
        Perro miOtroPerro = new Perro("Luna", fecha, "8904", "Clara", "Salchicha");

        fecha = LocalDateTime.of(2020, 5, 5, 5, 55, 5);
        Gato miGato = new Gato("Lata", fecha, "8903", "Antonio");

        ArrayList<Mascota> listaMascotas = new ArrayList<Mascota>();
        listaMascotas.add(miPerro);
        listaMascotas.add(miOtroPerro);
        listaMascotas.add(miGato);
        System.out.println(listaMascotas);

        System.out.println("Imprimimos el nombre de todas las mascotas:");
        for (Mascota m : listaMascotas){
            System.out.println(m.getNombre());
            System.out.println(m.onomatopeyar());
            if (m instanceof Perro) {
                Perro p = new Perro(m.getNombre(),m.getFechaNac(),m.getMicrochip(),m.getNombreDuenio());
                System.out.println(p.pasear());
            }
            if (m instanceof Perro) {
                Perro p = (Perro)m; // Castear de mascota a perro.
                System.out.println(p.pasear());
            }
        }
    }
}
