public class PasoPorReferencia {

    public static void main(String[] args) {
        
        metodoReferencia("Maria", 3);
        metodoReferencia("Pablo", 1);
        metodoReferencia("Juan", 19);
        

    }

    static void metodoReferencia(String nombre , int edad){
        System.out.println(nombre + " tiene "+ edad + " años");
    }



}
