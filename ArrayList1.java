
import java.util.ArrayList;

public  class  ArrayList1{
    public static void main(String[] args) {
        ArrayList<Integer>StudentIDS = new ArrayList<>();
        StudentIDS.add(101);
        StudentIDS.add(131);
        StudentIDS.add(121);

        StudentIDS.remove(Integer.valueOf(131));
        for(int id : StudentIDS){
            System.out.println(id);
        }
    }
}