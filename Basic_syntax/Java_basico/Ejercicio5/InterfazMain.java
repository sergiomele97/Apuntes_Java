package Java_basico.Ejercicio5;

public class InterfazMain {
    public static void main(String[] args) {
        CocheCRUDImpl Coche = new CocheCRUDImpl();
        Coche.save();
        Coche.delete();
        Coche.findAll();
    }
}
