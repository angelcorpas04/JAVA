package maquinadebolas;

import java.util.ArrayList;

public class MaquinaDeBolas {
    private double precioDeLaBola;
    private ArrayList<Juguete> juguetes;

    public MaquinaDeBolas() {
        this.precioDeLaBola = 2.0;
        this.juguetes = this.rellenarMaquinaDeBoLas();
    }
    
    public MaquinaDeBolas(double precioDeLaBola, ArrayList<Juguete> listaJuguetes) {
        //this();
        this.precioDeLaBola = 2.0;                        // this() evitaría esta línea.
        this.setPrecioDeLaBola(precioDeLaBola);
        this.juguetes = this.rellenarMaquinaDeBoLas();    // this() evitaría esta línea.
        this.setJuguetes(listaJuguetes);
    }
    
    public double getPrecioDeLaBola() {
        return precioDeLaBola;
    }

    public void setPrecioDeLaBola(double precioDeLaBola) {
        if(precioDeLaBola % 0.50 == 0) {
            this.precioDeLaBola = precioDeLaBola;
        }
    }

    public ArrayList<Juguete> getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(ArrayList<Juguete> juguetes) {
        if(juguetes.size() >= 5) {
            this.juguetes = juguetes;
        }
    }

    public Juguete obtenerJugueteAleatorio() {
        Juguete jugueteFinal = null;
        if(this.juguetes.size() > 0){
            int posicionJuguete = (int)(Math.floor(Math.random()*(this.juguetes.size())));
            //Eliminamos el juguete porque no tiene sentido que una bola salga y no se elimine de la lista de bolas.
            jugueteFinal = this.juguetes.remove(posicionJuguete);
        }
        return jugueteFinal;
    }
    
    public double obtenerBeneficio(Juguete j) {
        return this.precioDeLaBola - j.getPrecio();
    }

    // Este método solamente sirve para crear una lista de juguetes y utilizarla al inicializar la máquina de bolas.
    private ArrayList <Juguete> rellenarMaquinaDeBoLas() {
        ArrayList <Juguete> juguetesIniciales = new ArrayList<Juguete>();
        for (int i = 0; i < 5; i++) {
            Juguete j = new Juguete("Juguete"+i);
            juguetesIniciales.add(j);
        }
        return juguetesIniciales;
    }
    
    @Override
    public String toString() {
        return "La bola vale: " + precioDeLaBola + "€ para los siguientes juguetes: \n" + juguetes;
    }
    
    public static void main(String[] args) {
        Juguete jugueteDefecto = new Juguete();
        Juguete jugueteCompleto = new Juguete("miJuguete", 0.65);
        Juguete jugueteNombre = new Juguete("miJugete");
        ArrayList<Juguete> listaJuguetes = new ArrayList<Juguete>();
        listaJuguetes.add(jugueteDefecto);
        listaJuguetes.add(jugueteCompleto);
        listaJuguetes.add(jugueteNombre);
        listaJuguetes.add(jugueteCompleto);
        listaJuguetes.add(jugueteNombre);
        
        MaquinaDeBolas maquinaDeBolasDefecto = new MaquinaDeBolas();
        MaquinaDeBolas maquinaDeBolasCompleta = new MaquinaDeBolas(1,listaJuguetes);
        MaquinaDeBolas maquinaDeBolasPrecioMal = new MaquinaDeBolas(0.84,listaJuguetes);
        
        System.out.println(maquinaDeBolasDefecto);
        System.out.println(maquinaDeBolasCompleta);
        System.out.println(maquinaDeBolasPrecioMal);
        
        Juguete jugueteNuevo = maquinaDeBolasDefecto.obtenerJugueteAleatorio();
        System.out.println(jugueteNuevo);
        System.out.println(maquinaDeBolasDefecto);
        
        System.out.println("El beneficio de la bola ha sido de: " + maquinaDeBolasDefecto.obtenerBeneficio(jugueteNuevo) + "€" );
    }
}
