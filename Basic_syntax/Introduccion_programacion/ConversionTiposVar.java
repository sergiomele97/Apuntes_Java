package Introduccion_programacion;

public class ConversionTiposVar {

    public static void main(String[] args){

        double temperatura = 15.9;
        int temperaturaInt = (int)temperatura;
        imprimeTemperatura(temperaturaInt);
    }

    public static void imprimeTemperatura(int valor){
        System.out.println(valor);
    }
}
