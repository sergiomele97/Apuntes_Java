package Java_basico.Ejercicio4;

public class SmartWatch extends SmartDevice{

    public SmartWatch(double peso, double precio, String procesador) {
        super(peso, precio, procesador);
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "peso=" + peso +
                ", precio=" + precio +
                ", procesador='" + procesador + '\'' +
                '}';
    }
}
