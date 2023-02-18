package Introduccion_programacion;

public class Loops {

    public static void main(String[] args){
        int contador = 10;

        while (contador > 0) {
            System.out.println(contador);
            contador -= 1;
        }
        contador = 10;

        do {
            System.out.println(contador);
            contador -= 1;
        } while (contador > 0);


    }

}
