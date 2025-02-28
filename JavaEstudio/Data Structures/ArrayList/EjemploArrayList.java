import java.util.ArrayList;

public class EjemploArrayList{
    public static void main(String[] args) {

        ArregloString();

    }

    static void ArregloString(){

        ArrayList<String> carros = new ArrayList<String>(); //Objeto lista de carros

        System.out.println("\nEl arraylist es: ");

        carros.add("Aston Martin");
        carros.add("Nissan");
        carros.add("Porsche");
        carros.add("Ford");
        carros.add("Ferrari");

        
        //Ciclo para cada uno (foreach)
        for (String i : carros) {
            System.out.println(i);
        }

    }
}



