package Introduccion_programacion;

public class Class {

    public static void main(String[] args) {
        Potato miPotato = new Potato();
        miPotato.QuitarBrazo();
        System.out.println(miPotato.brazos);
    }

static class Potato {
    public int brazos = 0;

    public void QuitarBrazo() {
        this.brazos--;
        }

    }
}
