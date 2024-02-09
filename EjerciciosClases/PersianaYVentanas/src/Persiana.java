public class Persiana{
    private double tamanio;
    private boolean estaSubida;

    public Persiana(){
        this.tamanio = 0;
        this.estaSubida = false;
    }
    public Persiana(double tamanio, boolean estaSubida){
        this.tamanio = tamanio;
        this.estaSubida = estaSubida;
    }
    public Persiana(Persiana p){
        this.tamanio = 0;
        this.estaSubida = false;
    }

    public static void main(String[] args) {
        
    }
}