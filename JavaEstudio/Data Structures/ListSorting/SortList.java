import java.util.ArrayList;
import java.util.Collections; //Importar la clase de collections

public class SortList {
    public static void main(String[] args) {
        
        ArrayList<String> carros = new ArrayList<String>();

        carros.add("Aston Martin");
        carros.add("Nissan");
        carros.add("Porsche");
        carros.add("Ford");
        carros.add("Ferrari");

        Collections.sort(carros); // ordena en orden asc

        for (String i : carros) {
            System.out.println(i);
        }

        Collections.sort(carros,Collections.reverseOrder()); // ordena en orden en reverso

        for (String i : carros) {
            System.out.println(i);
        }

    }
    
}
