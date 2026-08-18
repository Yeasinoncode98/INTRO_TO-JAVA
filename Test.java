public class Test{
    public static void main(String[] args) {
        try{
            int data = 50/0;
            System.out.println("print the data: "+data);

        }
        catch(ArithmeticException e ){
            System.out.println(e);
        }

    }
}