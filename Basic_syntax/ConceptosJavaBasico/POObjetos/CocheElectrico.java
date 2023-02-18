package ConceptosJavaBasico.POObjetos;

public class CocheElectrico extends Coche{  // extends

    String motorElectrico;

    public CocheElectrico(String motorElectrico, String color, String fabricante, String modelo, Double peso, Double largo){
        super(color, fabricante, modelo, peso, largo);  // El método super llama al constructor de la clase superior
        this.motorElectrico = motorElectrico;
    }

    public CocheElectrico(){

    }

    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    @Override   // Esto es una anotación: permite aportar metadatos a los metodos o clases
    public void acelerar(Integer cantidad) {    // Override = Sobreescribir comprueba que haya un metodo acelerar en la clase superior
        Integer cantidadAjustada = cantidad + 2;
        super.acelerar(cantidadAjustada);   // super llama a la clase superior
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}

