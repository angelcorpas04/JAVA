public class Ventanilla {

    private boolean transparencia;
    private double tamanio;
    private boolean estado;

    /**
     * Constructor por defecto: Es transparente, está subida y tamaño 15
     * @param args
     */
    public Ventanilla(boolean transparencia, double tamanio, boolean estado){
        this.transparencia = true;
        this.tamanio = 15;
        this.estado = true;
    }

    /**
     * Constructor por parámetros transparencia y tamaño
     * @param args
     */
    public Ventanilla(boolean transparencia, double tamanio){
        this.transparencia = transparencia;
        this.tamanio = tamanio;
    }

    /**
     * Constructor de copia
     * @param args
     */
    public Ventanilla(Ventanilla v){
        this.transparencia = v.transparencia;
        this.tamanio = v.tamanio;
        this.estado = v.estado;
    }

    public boolean getTransparencia(){
        return this.transparencia;
    }

    public double getTamanio(){
        return this.tamanio;
    }

    public boolean getEstado(){
        return this.estado;
    }

    private void setTransparencia(boolean transparencia){
        this.transparencia = transparencia;
    }

    public void setTamanio(double tamanio){
        this.tamanio = tamanio;
    }

    private void setEstado(boolean estado){
        this.estado = estado;
    }

    public void subirVentanilla(){
        this.setEstado(true);

    }
    public void bajarVentanilla(){
        this.setEstado(false);
    }

    public void tintarCristales(){
        this.setTransparencia(true);
    }
    public void destintarCristales(){
        this.setTransparencia(false);
    }

    public String toString(){
        String salida = "La ventanilla es ";

        if (this.transparencia) salida += "transparente. ";
        else salida += "de cristal tintado. ";
        salida += "Es de tamaño " + this.tamanio + " y está ";

        if (this.estado) salida += "subida.";
        else salida += "bajada.";

        return salida;
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}