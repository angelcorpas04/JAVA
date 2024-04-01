public class Boligrafo {
    private String color;
    private int numUsos;

    private static final int NUMUSOSMAX = 500;

    public Boligrafo(){
        this.color = "azul";
        this.numUsos = 0;
    }
    public Boligrafo(String color, int numUsos){
        this.color = color;
        this.numUsos = 0;
        this.setNumUsos(numUsos);
    }
    public Boligrafo(Boligrafo b){
        this.color = b.color;
        this.numUsos = b.numUsos;
    }

    public String getColor() {
        return this.color;
    }
    public int getNumUsos() {
        return this.numUsos;
    }
    public static int getNumusosmax() {
        return NUMUSOSMAX;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setNumUsos(int numUsos) {
        if (numUsos>0 && numUsos<NUMUSOSMAX) this.numUsos = numUsos;
    }

    public boolean escribir(){
        boolean puedoEscribir = false;
        if (this.numUsos < NUMUSOSMAX) {
            this.numUsos++;
            puedoEscribir = true;
        }
        return puedoEscribir;
    }
    public boolean escribir(String texto){
        boolean puedoEscribir = false;
        int numLetrasUso = 20;
        // No tenemos en cuenta que los espacios no gastan tinta.
        int numUsosTexto = (texto.length()/numLetrasUso) + 1;
        if (this.numUsos + numUsosTexto <= NUMUSOSMAX) {
            this.numUsos += numUsosTexto;
            puedoEscribir = true;
        }
        return puedoEscribir;
    }

    @Override
    public String toString() {
        return "He usado mi boli " + this.color + " " + this.numUsos + " veces.";
    }

    public static void main(String[] args) {
        Boligrafo miBoliPorDefecto = new Boligrafo();
        Boligrafo miBoliConPurpurina = new Boligrafo("amarillo con purpurina",0);
    
        String texto = "La razón de la sinrazón que a mi razón se hace, de tal manera que mi razón enflaquece, que con razón me quejo de vueestra fermosura.";
        System.out.println(miBoliPorDefecto);
        System.out.println(miBoliConPurpurina);

        miBoliPorDefecto.escribir();
        miBoliConPurpurina.escribir(texto);

        System.out.println(miBoliPorDefecto);
        System.out.println(miBoliConPurpurina);
    }
}