package Introduccion_programacion.Ejercicios;

public class Ejercicios_tema_9 {

    public static void main(String[] args){

    Cliente cliente = new Cliente();

    cliente.credito = 9999;
    cliente.edad = 25;
    cliente.nombre = "Manolo";
    cliente.telefono = 636363288;

    System.out.printf("\nCredito: " + cliente.credito + "\nEdad: " + cliente.edad);
    System.out.printf("\nNombre: " + cliente.nombre + "\nTelefono: " + cliente.telefono);

    Trabajador trabajador = new Trabajador();

    trabajador.salario = 1000;
    trabajador.edad = 24;
    trabajador.nombre = "Pepe";
    trabajador.telefono = 636364588;

    System.out.printf("\n\nSalario: " + trabajador.salario + "\nEdad: " + trabajador.edad);
    System.out.printf("\nNombre: " + trabajador.nombre + "\nTelefono: " + trabajador.telefono);

    }
}

class Persona{

    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona{

    int credito;

}

class Trabajador extends Persona{
    int salario;
}