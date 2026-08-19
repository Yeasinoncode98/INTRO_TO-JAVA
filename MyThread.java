
class HelloTask implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WorldTask implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("World: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MyThread {

    public static void main(String[] args) {
        Runnable hellotask = new HelloTask();
        Runnable worldtask = new WorldTask();

        Thread t1 = new Thread(hellotask);
        Thread t2 = new Thread(worldtask);

        t1.start();
        t2.start();
    }
}
