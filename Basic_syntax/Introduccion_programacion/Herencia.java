package Introduccion_programacion;

public class Herencia {

    public static void main(String[] args){
        Portatil portatil = new Portatil();
        portatil.setMarca("Opel");
        System.out.println(portatil.getMarca());
    }
}

class Ordenador {
    int espacioAlmacenamiento;
    private String marca;

    public Ordenador(){
        System.out.println("Estoy en el constructor de Introduccion_programacion.Vehiculo");
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

}

class Pantalla {
    int pulgadas;
}

class Portatil extends Ordenador{

}

class PortatilTactil extends Portatil{  // Introduccion_programacion.Herencia multinivel

}