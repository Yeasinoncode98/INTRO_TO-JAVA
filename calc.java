
class Calculator {

    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int Add() {
        return num1 + num2;
    }

    public int Sub() {
        return num1 - num2;
    }

    public int Multiply() {
        return num1 * num2;
    }

    public int Divide() {
        try {
            return num1 / num2;
        } catch (ArithmeticException E) {
            System.out.println("Error --> Cant divide by zero: " + E);
            return 0;
        }
    }

}

public class calc {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setNum1(10);
        c.setNum2(2);
        System.out.println("Add: " + c.Add());
        System.out.println("Sub: " + c.Sub());
        System.out.println("Multi: " + c.Multiply());
        System.out.println("Divide: " + c.Divide());
    }
}
