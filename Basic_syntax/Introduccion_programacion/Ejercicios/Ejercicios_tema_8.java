package Introduccion_programacion.Ejercicios;

public class Ejercicios_tema_8 {

    public static void main(String[] args){

    Person persona = new Person();

    persona.setEdad(49);
    persona.setNombre("Julian");
    persona.setTelefono(939483933); // Hasta cierto punto, todos los int ocupan lo mismo, despues hay overflow.

    int edad = persona.getEdad();
    String nombre = persona.getNombre();
    int telefono = persona.getTelefono();

        System.out.printf("Edad: %d\nNombre: %s\nTelefono: %d", edad, nombre, telefono);
    }
}

class Person{

    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono){
        this.telefono= telefono;
    }
}
