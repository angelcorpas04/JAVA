public class Cuadrado extends FiguraGeometricaRegular{
    
    private static final int NLADOS = 4;

    public Cuadrado(){
        super();
    }
    public Cuadrado(double longLado){
        super(longLado, NLADOS);
    }
    public Cuadrado(Cuadrado c){
        super(c);
    }

    public static int getNlados() {
        return NLADOS;
    }


    public double area(){
        return this.getLongLado()*this.getLongLado();
    }

    public String toString(){
        return "Tengo un cuadrado de lado: " + this.getLongLado();
    }

    public static void main(String[] args) {
        Cuadrado c = new Cuadrado(4.5);
        System.out.println(c);
        System.out.println("El perímetro es: " + c.perimetro());
        System.out.println("El área es: " + c.area());

    }
}