
import java.util.ArrayList;

public class try1 {

    public static void main(String[] args) {

        ArrayList<Integer> Students = new ArrayList<>();

        Students.add(101);
        Students.add(102);
        Students.add(103);

        Students.remove(Integer.valueOf(102));

        for (int id : Students) {
            System.out.println("Students list: " + id);
        }
    }
}
