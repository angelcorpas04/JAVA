/*
**VENTANA**  
**Atributos**: El tamaño _no puede ser negativo_ de la ventana, el nivel de transparencia del cristal _en porcentaje, siento 100 totalmente transparente_, si está abierta o no _por defecto estará cerrada_ y una persina _que no puede ser mayor que la ventana_.  
**Métodos**:  
abrir() .- Permite abrir la ventana.  
cerrar() .- Permite cerrar la ventana. 
*/

public class Ventana {
    private double tamanio;
    private int transparencia;
    private boolean estaAbierta;
    private Persiana persiana;

   public Ventana(){
       this.tamanio = 0;
       this.transparencia = 100;
       this.estaAbierta = false;
       this.persiana  = new Persiana();
   }
   public Ventana(double tamanio, int transparencia, boolean estaAbierta){
       this.tamanio = 0;
       this.setTamanio(tamanio);
       this.transparencia = 100;
       this.setTransparencia(transparencia);
       this.estaAbierta = estaAbierta;
       this.persiana = new Persiana(this.tamanio);
   }
   public Ventana(double tamanio, int transparencia, boolean estaAbierta, Persiana persiana){
       this.tamanio = 0;
       this.setTamanio(tamanio);
       this.transparencia = 100;
       this.setTransparencia(transparencia);
       this.estaAbierta = estaAbierta;
       this.persiana = new Persiana(this.tamanio);
       this.setPersiana(persiana);
   }
   public Ventana(Ventana p){
       this.tamanio = p.tamanio;
       this.transparencia = p.transparencia;
       this.estaAbierta = p.estaAbierta;
       this.persiana = new Persiana(this.tamanio);
       this.setPersiana(p.persiana);
   }
   
   public double getTamanio(){
       return this.tamanio;
   }
   public int getTransparencia(){
       return this.transparencia;
   }
   public boolean getEstaAbierta(){
       return this.estaAbierta;
   }
   public Persiana getPersiana(){
       return this.persiana;
   }

   public void setTamanio(double tamanio){
       if (tamanio > 0) this.tamanio = tamanio;
   }
   public void setTransparencia(int transparencia){
       if (transparencia >= 0 && transparencia <= 100) this.transparencia = transparencia;
   }
   private void setEstaAbierta(boolean estaAbierta){
       this.estaAbierta = estaAbierta;
   }
   public void setPersiana(Persiana persiana){
       if (persiana.getTamanio() <= this.tamanio){
           // No hacer this.persiana = persiana porque copiamos solo el puntero.
           // No podemos hacer: this.persiana.tamanio = persiana.tamanio;
           // Al no estar en la clase persiana no tenemos acceso a .tamanio de persiana.
           // Para acceder a esa información tenemos que usar sus métodos públicos.
           this.persiana.setTamanio(persiana.getTamanio());
           this.persiana.setEstaSubida(persiana.getEstaSubida());
       }
   }

   public void abrir(){
       this.setEstaAbierta(true);
   }
   public void cerrar(){
       this.setEstaAbierta(false);
   }

   public String toString(){
       String salida = "La ventana, de cristales " + this.transparencia + "% transparentes está ";
       
       if (this.estaAbierta) salida += "abierta.\n";
       else salida += "cerrada. \n";

       salida += this.persiana.toString();

       return salida;
   }

   public static void main(String[] args) {
       
       Persiana persiana1 = new Persiana(1.34,true);
       
       Ventana ventana1 = new Ventana();
       Ventana ventana2 = new Ventana(1.52,50,true);
       Ventana ventana3 = new Ventana(2.22,75,false,persiana1);
       Ventana ventana4 = new Ventana(ventana3);
       
       

       System.out.println("La ventana 1: " + ventana1);
       System.out.println("La ventana 2: " + ventana2);
       System.out.println("La ventana 3: " + ventana3);
       System.out.println("La ventana 4: " + ventana4);

       ventana3.cerrar();
       System.out.println("Cerramos la ventana 3: " + ventana3);
       ventana3.abrir();
       System.out.println("Abrimos la ventana 3: " + ventana3);

       //Bajar la persiana de la ventana3.
       ventana3.getPersiana().bajar();
       System.out.println("Abrimos la ventana 3: " + ventana3);
       System.out.println("La ventana 4: " + ventana4);

   }
}