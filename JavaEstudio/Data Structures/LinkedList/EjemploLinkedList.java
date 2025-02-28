import java.util.LinkedList;

public class EjemploLinkedList {

    public static void main(String[] args) {

        LinkedList<String> carritos = new LinkedList<>();

        carritos.add("Volvo");
        carritos.add("Lamborguini");
        carritos.add("Mazda");

        System.out.println(carritos);

        //Agregando un valor al incicio
        carritos.addFirst("Nissan");
        System.out.println(carritos);

        //Quitar un valor 
        carritos.removeLast();
        System.out.println(carritos);
        
        //Obtener el ultimo dato
        System.out.println(carritos.getLast());


        /*
         *  addFirst() 	Adds an item to the beginning of the list 	
            addLast() 	Add an item to the end of the list 	
            removeFirst() 	Remove an item from the beginning of the list 	
            removeLast() 	Remove an item from the end of the list 	
            getFirst() 	Get the item at the beginning of the list 	
            getLast() 	Get the item at the end of the list
         */

         
    }
}