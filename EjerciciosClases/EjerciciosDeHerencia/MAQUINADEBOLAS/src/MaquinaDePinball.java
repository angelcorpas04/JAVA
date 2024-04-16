package maquinadebolas;

import java.util.ArrayList;

public class MaquinaDePinball extends MaquinaDeBolas{
    private int puntos;
    
    public MaquinaDePinball() {
        super();
        this.puntos = 0;
    }

    public MaquinaDePinball(double precioDeLaBola, ArrayList<Juguete> listaJuguetes, int puntos) {
        super(precioDeLaBola, listaJuguetes);
        this.puntos = 0;
        this.setPuntos(puntos);
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        if(puntos >= 0) {
            this.puntos = puntos;
        }
    }

    public int jugar() {
        System.out.println("Jugando al pinball");
        int aleatorio = (int) (Math.floor(Math.random()*(200-20+1)+20));
        this.puntos += aleatorio;
        return aleatorio;
    }
    
    public Juguete obtenerJugueteAleatorio() {
        Juguete jugueteFinal = null;
        int posicionJuguete;
        if(getJuguetes().size() > 0){
            do{
            posicionJuguete = (int)(Math.floor(Math.random()*(getJuguetes().size())));
            //Se multiplica el precio por 100 porque el precio está en euros y los puntos en centimos.
            }while (this.getJuguetes().get(posicionJuguete).getPrecio()*100 > this.puntos);
            //Eliminamos el juguete porque no tiene sentido que una bola salga y no se elimine de la lista de bolas.
            jugueteFinal = getJuguetes().remove(posicionJuguete);
            //CUIDADO: Con esta solución, si no hay ninguna bola que cumpla la condición se queda en bucle infinito.
        }
        return jugueteFinal;
    }
    
    @Override
    public String toString() {
        return "He ganado " + this.puntos + " puntos en " + super.toString();
       
    }
    
    public static void main(String[] args) {
        
        Juguete jugueteDefecto = new Juguete();
        Juguete jugueteCompleto = new Juguete("miJuguete", 0.65);
        Juguete jugueteNombre = new Juguete("miJugete");
        Juguete jugueteOtroCompleto = new Juguete("miJute", 0.65);
        Juguete jugueteOtroNombre = new Juguete("miJugte");
        ArrayList<Juguete> listaJuguetes = new ArrayList<Juguete>();
        listaJuguetes.add(jugueteDefecto);
        listaJuguetes.add(jugueteCompleto);
        listaJuguetes.add(jugueteNombre);
        listaJuguetes.add(jugueteOtroCompleto);
        listaJuguetes.add(jugueteOtroNombre);
        
        System.out.println("Lista de juguetes " + listaJuguetes);
        
        MaquinaDePinball maquinaDePinballDefecto = new MaquinaDePinball();
        MaquinaDePinball maquinaDePinballCompleta = new MaquinaDePinball(1,listaJuguetes,0);
        
        System.out.println("Por defecto: " + maquinaDePinballDefecto);
        System.out.println("Completa: " +maquinaDePinballCompleta);
        
        maquinaDePinballDefecto.setPuntos(200);
        Juguete jugueteNuevo = maquinaDePinballDefecto.obtenerJugueteAleatorio();
        System.out.println(jugueteNuevo);
        System.out.println(maquinaDePinballDefecto);
        
        System.out.println("El beneficio de la bola ha sido de: " + maquinaDePinballDefecto.obtenerBeneficio(jugueteNuevo) + "€" );
    
    }  
}