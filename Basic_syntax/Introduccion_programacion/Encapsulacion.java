package Introduccion_programacion;

public class Encapsulacion {

    public static void main(String[] args){
        Mediotransporte camion = new Mediotransporte();

        camion.setTipo ("Camion");

        String tipo = camion.getTipo();
        System.out.println(tipo);

    }
}

class Mediotransporte{
    private String tipo;

    public void setTipo(String valor){  // Esto es un metodo setter
        this.tipo = valor;
    }

    public String getTipo(){    // Esto es un metodo getter
        return this.tipo;
    }

}