
abstract class Payment {

    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    abstract void processPayment();
}

class CreditCardPayment extends Payment {

    int creditCardNumber;
    String cardHolderName;

    public CreditCardPayment(int creditCardNumber, String cardHolderName, double amount) {
        super(amount);
        this.creditCardNumber = creditCardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    void processPayment() {
        System.out.println("credit Card payment");
        System.out.println("credit Card Amount Processing: " + amount);
        System.out.println("credit Card Number: " + creditCardNumber);
        System.out.println("credit Card Holder Name: " + cardHolderName);
    }
}

class MobilePayment extends Payment {

    int mobileNumber;
    String provider;

    public MobilePayment(int mobileNumber, String provider, double amount) {
        super(amount);
        this.mobileNumber = mobileNumber;
        this.provider = provider;
    }

    @Override
    void processPayment() {
        System.out.println("Mobile payment");
        System.out.println("Mobile Payment Amount Processing: " + amount);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Provider: " + provider);
    }

}

public class Summer25 {

    public static void main(String[] args) {

        Payment[] payments = {
            new CreditCardPayment(987353728, "Yeasin", 50000),
            new MobilePayment(162, "Airtel", 5000)
        };
        for (Payment p : payments) {
            p.processPayment();
            System.out.println("System is running well ");
        }

    }

}
