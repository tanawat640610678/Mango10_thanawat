public class Main {
    public static void main(String[] a)
     {
        Thread thread1 = new Thread(new Greb());
        Thread thread2 = new Thread(new Stalk());

        thread1.start();
        thread2.start();
    
     }
}
