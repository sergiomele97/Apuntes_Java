package Java_basico;

public class Iva {

    public static void main(String[] args) {

        double precio = 40.5;
        double iva = 17;

        System.out.println(anadirIva(precio, iva));

    }

    static double anadirIva(double precio, double iva) {
        return(precio*(1+iva/100));
    }
}
