import java.time.LocalDateTime;

public class Mascota {
    private String nombre;
    private String microchip;
    // private Persona duenio;
    private String nombreDuenio;
    private LocalDateTime fechaNacimiento;

    public Mascota(){
        this.nombre = "";
        this.fechaNacimiento = LocalDateTime.now();
        this.microchip = "000000000000";
        this.nombreDuenio = "";
    }
    // public Mascota(String nombre, LocalDateTime fechaNacimiento, String microchip, String nombreDuenio){
    //     setNombre(nombre);
    //     this.fechaNacimiento = LocalDateTime.now();
    //     setFechaNac(fechaNacimiento);
    //     this.microchip = "000000000000";
    //     setMicrochip(microchip);
    //     this.nombreDuenio = "";
    //     setNombreDuenio(nombreDuenio);
    // }
    public Mascota(String nombre, LocalDateTime fechaNacimiento, String microchip, String nombreDuenio){
        this();
        setNombre(nombre);
        setFechaNac(fechaNacimiento);
        setMicrochip(microchip);
        setNombreDuenio(nombreDuenio);
    }
    public Mascota(Mascota m){
        this(m.nombre, m.fechaNacimiento, m.microchip, m.nombreDuenio);
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getMicrochip(){
        return this.microchip;
    }
    public String getNombreDuenio(){
        return this.nombreDuenio;
    }
    public LocalDateTime getFechaNac(){
        return this.fechaNacimiento;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setMicrochip(String microchip){
        this.microchip = microchip;
    }
    public void setNombreDuenio(String nombreDuenio){
        this.nombreDuenio = nombreDuenio;
    }
    public void setFechaNac(LocalDateTime fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public String comer(){
        return "Comiendo...";
    }
    public String evacuar(){
        return "Evacuando...";
    }
    public String jugar(){
        return "Jugando...";
    }
    public String dormir(){
        return "Durmiendo...";
    }
    public String onomatopeyar(){
        return "*ruiditos de animales*";
    }

    public String toString(){
        return "Se llama " + this.nombre + ", nació el " + this.fechaNacimiento + "y su dueño/a es " + this.nombreDuenio + ".";
    }

    public static void main(String[] args) {
        System.out.println("Hola, soy una mascota!");
        Mascota mascotaPorDefecto = new Mascota();
        System.out.println(mascotaPorDefecto);

        LocalDateTime fecha = LocalDateTime.now();
        Mascota mascotaParametros = new Mascota("mascota", fecha, "5", "dueño");
        System.out.println(mascotaParametros);

        System.out.println(mascotaPorDefecto.dormir());
    }
    
}