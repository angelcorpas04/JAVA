package com.stem;

import java.util.Scanner;

public class Nube {

    public enum TiposDeNube {
        CIRROS,
        CUMULOS,
        ESTRATOS,
        NIMBOS;

        public static String mostrar(){
            return "[CIRROS, CUMULOS, ESTRATOS, NIMBOS]";
        }
    }

    private TiposDeNube tipo;
    private double altura;
    private double tamanio; //cm3

    public Nube(){
        this.tipo = TiposDeNube.CIRROS;
        this.altura = 3000;
        this.tamanio = 1000; 
    }
    public Nube(TiposDeNube tipo, double altura, double tamanio){
        this.tipo = tipo;
        this.altura = altura;
        this.tamanio = tamanio;
    }
    public Nube(Nube n){
        this.tipo = n.tipo;
        this.altura = n.altura;
        this.tamanio = n.tamanio;
    }

    public void setTamanio(double tamanio){
        this.tamanio = tamanio;
    }

    /* No se aprovecha la orientación a objetos, al llamarlo de forma estática
       y pasarle las dos nubes en vez de llamar al método desde una nube.unir(nube2)
       como en el método de abajo.
    public static void unir(Nube n1, Nube n2){
        if (n1.altura == n2.altura){
            n1.tamanio += n2.tamanio;
            n2.tamanio = 0;
            n2.altura = 0;
        }
    }*/

    /**
     * Une dos nubes en la primera (this), que se encuentren a la misma altura,
     * sumando sus tamanios.
     * 
     * @param n Un objeto de tipo nube, que vamos a fusionar con this.
     * @return tamanio final que tiene la nube al unirse o -1 en caso de que no se unan.
     * 
     */
    // A un método sin return no podemos realizarle pruebas, por eso a veces es
    // necesario dar una salida de error en nuestros métodos.
    public double unir(Nube n){
        double salida = -1;
        if (this.altura == n.altura){
            this.tamanio += n.tamanio;
            n.tamanio = 0;
            n.altura = 0;
            salida = this.tamanio;
        }
        return salida;
    }

    /**
     * Aumenta el tamaño de la nube en un 50%
     * @return Devuelve el tamanio
     */
    public double crecer(){
                             // tamanio += tamanio * 0.5
        this.tamanio *= 1.5; // tamanio = tamanio * 1.5
        // Para las pruebas necesitamos un return:
        return this.tamanio;
    }

    /**
     * La nube sube los metros indicados. En caso de que el número de 
     * metros sea negativo, baja. 
     * @param metros Indica el número de metros que sube la nube.
     * @return Devuelve la altura.
     */
    public double subir(double metros){
        if (metros > 0 ) this.altura += metros;
        // Si los metros son negativos, llamamos a bajar() con el 
        // número de metros en positivo.
        else this.bajar(-metros);
        // Para las pruebas necesitamos un return:
        return this.altura;
    }

    /**
     * La nube baja los metros indicados.
     * @param metros Indica el número de metros que sube la nube. Debe ser positivo.
     * @return Devuelve la altura.
     */
    public double bajar(double metros){
        if (metros > 0 ) this.altura -= metros;
        if (this.altura < 0) this.altura = 0;
        // Para las pruebas necesitamos un return:
        return this.altura;
     }

     /**
      * ¿Puede llover? Puede llover si la altura de la nube es mayor que 
      * 1000 y su tamanio es mayor de 200.
      * @return true en caso de que se cumpla la condición.
      */
      public boolean puedeLlover(){
        return this.tamanio>=200 && this.altura>=1000;
      }
      
    /**
     * Llueve si puede llover.
     * El volumen se reduce a un tercio del tamaño de la nube inicial.
     * 
     */
    public double llover(){
        if (this.puedeLlover()) {
            this.tamanio /= 3;
        }
        return this.tamanio;
    }
      

    public String toString(){
        return "altura: " + this.altura + ". tamanio: " + this.tamanio;
    }
    public static void main(String[] args){
        Nube nube1 = new Nube(TiposDeNube.NIMBOS,10,30);
        //Nube nube2 = new Nube(NIMBOS,10,30); -> ERROR
        //Nube nube3 = new Nube("NIMBOS",10,30); -> ERROR

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tipo de nube [" + TiposDeNube.mostrar() + "] : ");
        String tipoFormatoString = sc.nextLine().toUpperCase();
        TiposDeNube tipoFormatoEnum = TiposDeNube.valueOf(tipoFormatoString);

        Nube nube2 = new Nube(tipoFormatoEnum,10,30);

        System.out.println(nube1);
        System.out.println(nube2);
        nube1.unir(nube2);
        System.out.println(nube1);
        System.out.println(nube2);
    }
}