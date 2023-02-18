package ConceptosJavaBasico.Syntaxis;

public class IfElse {

    public static void main(String[] args) {    // ATAJO main

        boolean check = 5 < 10;

        int number1 = 5;
        int number2 = 10;
        int number3 = 20;

        if (number1 < number2 && number2 < number3){    // Si solo es una linea se pueden evitar las {} "llaves"
            System.out.println("verdadero");   // ATAJO sout
        }else if(number3 > number1){
            System.out.println("HOla");
        }else{
            System.out.println("false");
        }

    }
}
