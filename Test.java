
//         try{
//             int data = 50/0;
//             System.out.println("print the data: "+data);
//         }
//         catch(ArithmeticException e ){
//             System.out.println(e);
//         }
//     }
// }
// public class Test {
//     public static void main(String[] args) {
//         ArrayList<Integer> Students = new ArrayList<>();
//         Students.add(101);
//         Students.add(102);
//         Students.add(103);
//         Students.remove(Integer.valueOf(103));
//         for (Integer integer : Students) {
//             System.out.println("Arrays are: " + integer);
//         }
//     }
// }
// public class Test {
//     public static void main(String[] args) {
//         HashSet<String> Students = new HashSet<>();
//         Students.add("Rahim");
//         Students.add("karim");
//         Students.add("Rahim");
//         System.out.println("Sets are: " + Students);
//     }
// }
// public class Test {
//     public static void main(String[] args) {
//         HashMap<Integer, String> Students = new HashMap<>();
//         Students.put(101, "Yeasin");
//         Students.put(102, "Arafat");
//         Students.put(103, "Musi");
//         System.out.println("Get Details of 101" + Students.get(101));
//         System.out.println("Contains key or not 102: " + Students.containsKey(102));
//         Students.remove(103);
//         System.out.println("After removing the details are: " + Students);
//     }
// }
public class Test {

    public static void main(String[] args) {

        try {
            int[] a = new int[5];
            System.out.println("Arrays Are: " + a[5]);

        } catch (Exception e) {
            System.out.println("Error will come: " + e);
        }
    }
}
