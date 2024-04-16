
public abstract class FiguraGeometricaRegular {

    private double longLado;
    private int numLados;

    public FiguraGeometricaRegular(){
        this.longLado = 1;
        this.numLados = 3;
    }
    public FiguraGeometricaRegular(double longLado, int numLados){
        this();
        setLongLado(longLado);
        setNumLados(numLados);
    }
    public FiguraGeometricaRegular(FiguraGeometricaRegular f){
        this(f.longLado,f.numLados);
    }

    public double getLongLado() {
        return this.longLado;
    }
    public int getNumLados() {
        return this.numLados;
    }

    public void setLongLado(double longLado) {
        if (longLado > 0) this.longLado = longLado;
    }
    /* Lo ponemos privado porque al ser una clase abstracta, no se van a 
    instanciar objetos de esta clase, y los ya tienen definido por defecto  
    su número de lados.*/
    private void setNumLados(int numLados) {
        if (numLados >= 3) this.numLados = numLados;
    }
    

    public double perimetro(){
        return this.numLados*this.longLado;
    }

    public abstract double area(); //  Podríamos hacer: perimetro*apotema/2

    public String toString(){
        return "El número de lados es: " + this.numLados + " y miden " + this.longLado;
    }

    public static void main(String[] args) {
        /* Lo comentamos porque se va a convertir en una clase abstracta: *//*
        FiguraGeometricaRegular f = new FiguraGeometricaRegular(2,5);
        System.out.println(f + "\nSu perímetro es: " + f.perimetro());
        */
    }




    // Aclaración sobre this. y super. 
    public String metodoASobreescribir(){
        return "Este es el método del padre";
    }

}

