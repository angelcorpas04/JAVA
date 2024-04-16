public class TrianguloRegular extends FiguraGeometricaRegular{
    
    private static final int NLADOS = 3;

    public TrianguloRegular(){
        super();
    }
    public TrianguloRegular(double longLado){
        super(longLado, NLADOS);
    }
    public TrianguloRegular(TrianguloRegular t){
        super(t);
    }

    public static int getNlados() {
        return NLADOS;
    }

    private double altura(){
        double lado = this.getLongLado();
        double medioLado = lado/2;
        // Math.sqrt es raiz cuadrada.
        return Math.sqrt((lado*lado)-(medioLado*medioLado));
    }

    public double area(){
        return this.getLongLado()*altura();
    }

    public String toString(){
        return "Tengo un triángulo regular de lado: " + this.getLongLado();
    }

    public static void main(String[] args) {
        TrianguloRegular t = new TrianguloRegular(4.5);
        System.out.println(t);
        System.out.println("El perímetro es: " + t.perimetro());
        System.out.println("El área es: " + t.area());
    }





    // Aclaración sobre this. y super. 
    public String metodoASobreescribir(){
        return "Este es el método del hijo";
    }
    public String metodoPrueba(){
        return  "Al sobreescribir el metodo el hijo escribe: {" + 
                this.metodoASobreescribir() + "} y el padre escribe {" +
                super.metodoASobreescribir() + "}";
    }

}