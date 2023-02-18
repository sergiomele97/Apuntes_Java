package Introduccion_programacion;

public class Depuracion {

    public static void main(String[] args){
        int suma = 0;

        suma = suma + 15;

        System.out.println(suma);

        int valores[] = new int[5];
        int posicion = 4;

        System.out.println(valores[posicion]);

        funcion1();
    }

    public static void funcion1() {
        funcion2();
    }

    public static void funcion2() {
        funcion3();
    }

    public static void funcion3() {
        funcion4();
    }

    public static void funcion4() {
        System.out.println("Vaya viaje nos estamos dando");
    }
}
