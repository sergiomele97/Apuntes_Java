package ConceptosJavaBasico.POObjetos;

public abstract class Coche {   // Clase abstracta, no se puede instancia, solo a traves de clases hijas

    // atributos: Caracteristicas de cada objeto y que varian de uno a otro
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    // constructores: empiezan por mayusculas

    public Coche(){

    }

    public Coche(String color, String fabricante, String modelo, Double peso, Double largo){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    // comportamientos

    public void acelerar(Integer cantidad){
        this.velocidad += cantidad;
    }

    // ATAJO: CLICK DERECHO generate TO STRING...

    @Override
    public String toString() {  // permite imprimir los objetos creados
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
