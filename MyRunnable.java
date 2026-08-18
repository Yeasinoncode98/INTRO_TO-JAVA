public class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Runnable thread is running");
 
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}