
import java.util.HashMap;

public class HashMap1{
    public static void main(String[] args) {
        HashMap<Integer,String> Students = new HashMap<>();
        Students.put(101, "Sakib");
        Students.put(102, "Rakib");
        Students.put(103, "Nakib");

        System.out.println("Getting the details of 101:"+ Students.get(101));
        System.out.println("Checking key is there or not:"+Students.containsKey(103));
        Students.remove(102);
        System.out.println("After removing 102:"+Students);
    }
}

