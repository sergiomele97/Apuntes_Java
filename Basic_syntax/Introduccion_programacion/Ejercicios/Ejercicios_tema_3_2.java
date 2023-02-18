package Introduccion_programacion.Ejercicios;

public class Ejercicios_tema_3_2 {

    public static void main(String[] args) {

        coche ferrari = new coche();
        ferrari.añadir_puerta();
        System.out.println(ferrari.puertas);

    }

static class coche{

    public int puertas = 0;

    public void añadir_puerta() {
        this.puertas ++;

    }
}
}
