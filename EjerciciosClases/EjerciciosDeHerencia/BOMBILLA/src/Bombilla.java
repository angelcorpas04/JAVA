public abstract class Bombilla{
    private int luminosidad;

    public Bombilla(){
        this.luminosidad = 1000;
    }
    public Bombilla(int luminosidad){
        this();
        setLuminosidad(luminosidad);
    }

    public int getLuminosidad() {
        return this.luminosidad;
    }
    public void setLuminosidad(int luminosidad) {
        if (luminosidad >= 800 && luminosidad <= 1100) this.luminosidad = luminosidad;
    }

    public abstract String iluminar();

    public String toString(){
        return "Es una bombilla de " + this.luminosidad + " lumenes.";
    }

    public static void main(String[] args) {
    }
}