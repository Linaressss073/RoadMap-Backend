public class Excepciones {
    public static void main(String[] args) {
    

        verificarEdad(18);
        ejemplo();

    }


    static void verificarEdad(int age){
        if(age < 18){
            throw new ArithmeticException("Acceso denegado debe ser mayor de 18 años");
        }else{
            System.out.println("Acceso otorgado");
        }
    }


    static void ejemplo(){
    
        try {
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Ocurrio un error");
        } finally{
            System.out.println("La instruccion try catch ya finalizo");
        }

    }
}

