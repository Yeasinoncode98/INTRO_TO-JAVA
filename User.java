class Calculator {

    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }

    public int subtract() {
        return num1 - num2;
    }

    public int multiply() {
        return num1 * num2;
    }

    public int divide() {

        try {
            return num1 / num2;
        }

        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }
}


public class User {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.setNum1(10);
        c.setNum2(10);

        System.out.println("Addition: " + c.add());
        System.out.println("Subtraction: " + c.subtract());
        System.out.println("Multiplication: " + c.multiply());
        System.out.println("Division: " + c.divide());
    }
}