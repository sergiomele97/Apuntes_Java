package Introduccion_programacion;

public class ProgramacionOrientadaObjetos {

    public static void main(String[] args){
        Coche coche = new Coche(4, 90);
        Coche coche2 = new Coche();
        coche.acelerar();
        coche.decelerar();
        System.out.printf("Puertas: %d\n", coche.numeroDePuertas);
        System.out.println(coche.velocidadActual);
        System.out.println(coche2.velocidadActual);
    }
}

class Coche {
    int numeroDePuertas;
    int velocidadActual;
    int velocidadMaxima;

    public Coche(int numeroDePuertas, int velocidadMaxima){
        this.numeroDePuertas = numeroDePuertas;
        this.velocidadMaxima = velocidadMaxima;
        System.out.println("Estoy en el constructor con parametros");
    }

    //Ejemplo de sobrecarga de funciones en java

    public Coche(){
        numeroDePuertas = 15;
        velocidadMaxima = 80;
        System.out.println("Estoy en el constructor sin parametros");
    }
    public void acelerar(){
        velocidadActual += 15;
    }
    public void decelerar(){}

}