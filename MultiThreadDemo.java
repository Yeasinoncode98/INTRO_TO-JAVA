 class HelloTask implements Runnable{
    @Override
    public void run(){
        for(int i =1 ; i<= 5 ; i++){
            System.out.println("Hello :" +i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
 class WorldTask implements Runnable{
    @Override
    public void run(){
        for(int i =1 ; i<= 5 ; i++){
            System.out.println("World :" +i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadDemo{
    public static void main(String[] args) {
        Runnable hellotask = new HelloTask();
    Runnable worldTask = new WorldTask();

    Thread t1 = new Thread(hellotask);
    Thread t2 = new Thread(worldTask);
    t1.start();
    t2.start();
    System.out.println("Main Thread finished and now working others");
    }
}