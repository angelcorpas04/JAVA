import java.util.ArrayList;


public class BombillaRGB extends Bombilla {
    private ArrayList<Integer> rgb;

    public BombillaRGB(){
        super();
        rgb = new ArrayList<Integer>();
        rgb.add(0); // r
        rgb.add(0); // g
        rgb.add(0); // b
    }

    public BombillaRGB(String hex){
        this();
        rgb.set(0,Integer.parseInt(hex.substring(0,2),16));
        rgb.set(1,Integer.parseInt(hex.substring(2,4),16));
        rgb.set(2,Integer.parseInt(hex.substring(4),16));
    }

    public void setRgb(ArrayList<Integer> rgb) {
        this.rgb = (ArrayList<Integer>) rgb.clone();
    }

    private void setValor(int posicion, int valor){
        if( valor >= 0 && valor <=255) rgb.set(posicion, (Integer)valor);
    }
    public void setR(int r){
        setValor(0,r);
    }
    public void setG(int g){
        setValor(1,g);
    }
    public void setB(int b){
        setValor(2,b);
    }

    private boolean esLuzBlanca(){
        boolean esBlanca = true;
        for (int i = 0 ; i < this.rgb.size() && esBlanca ; i++){
            if( this.rgb.get(i) != 255) esBlanca = false;
        }
        return esBlanca;
    }

    public String iluminar(){
        String salida = "Es apropiada para estudiar.";
        if (this.getLuminosidad() < 1000 || !esLuzBlanca()) salida = "NO " + salida;
        return salida;
    }
    
    public String toString(){
        return super.toString() + this.rgb;
    }

    public static void main(String[] args) {
        BombillaRGB rgb = new BombillaRGB();
        rgb.setR(255);
        rgb.setG(255);
        rgb.setB(255);
        System.out.println(rgb.iluminar());
        rgb.setR(200);
        System.out.println(rgb);
        System.out.println(rgb.iluminar());

    }
}