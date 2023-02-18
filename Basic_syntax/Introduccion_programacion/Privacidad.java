package Introduccion_programacion;

public class Privacidad {

    public static void main(String[] args){
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.tipo = "Introduccion_programacion.Coche";
        System.out.println(vehiculo.tipo);

    }
}

class Vehiculo{
    String tipo;    // private = error
}