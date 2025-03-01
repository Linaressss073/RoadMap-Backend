public class ejemploThreads extends Thread{
    public static int cantidad = 0;
    public static void main(String[] args) {
        ejemploThreads thread = new ejemploThreads();
        thread.start();
        System.out.println(cantidad);
        cantidad++;
        System.out.println(cantidad);

        System.out.println("Este codigo esta fuera del hilo o thread");
    }
    
    public void run(){
        System.out.println("Este codigo esta dentro del codigo");
        cantidad++;
    }
}
