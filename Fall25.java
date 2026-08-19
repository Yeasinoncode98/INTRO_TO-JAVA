
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

    public int multi() {
        return num1 * num2;

    }

    public int divide() {
        try {
            return num1 / num2;
        } catch (Exception e) {
            System.out.println("Error will come cant divide by zero: " + e);
            return 0;
        }
    }
}

public class Fall25 {

    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.setNum1(10);
        c.setNum2(0);

        System.out.println("ADD: " + c.add());
        System.out.println("SUB: " + c.subtract());
        System.out.println("MUL: " + c.multi());
        System.out.println("DIV: " + c.divide());

    }
}
