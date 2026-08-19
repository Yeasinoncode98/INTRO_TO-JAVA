
abstract class Payment {

    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    abstract void processPayment();

}

class CreditCard extends Payment {

    int creditCardNumber;
    String creditCardHolderName;

    public CreditCard(int creditCardNumber, String creditCardHolderName, double amount) {
        super(amount);
        this.creditCardNumber = creditCardNumber;
        this.creditCardHolderName = creditCardHolderName;
    }

    @Override
    void processPayment() {
        System.out.println("Credit-Card Details");
        System.out.println("Credit-Card Processing Payment: " + amount);
        System.out.println("Credit-Card Number: " + creditCardNumber);
        System.out.println("Credit-Card Holder Name: " + creditCardHolderName);
    }
}

class MobileBanking extends Payment {

    String mobileNumber;
    String provider;

    public MobileBanking(String mobileNumber, String provider, double amount) {
        super(amount);
        this.mobileNumber = mobileNumber;
        this.provider = provider;
    }

    @Override
    void processPayment() {
        System.out.println("Mobile Banking Details");
        System.out.println("Mobile Bankung Processing Payment: " + amount);
        System.out.println("Mobile Banking Number: " + mobileNumber);
        System.out.println("Mobile Banking Provider Name: " + provider);
    }

}

class InternetBanking extends Payment {

    String bankName;
    String accountNumber;

    public InternetBanking(String bankName, String accountNumber, double amount) {
        super(amount);
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }

    void processPayment() {
        System.out.println("Internet Banking Details");
        System.out.println("Internet Bankung Processing Payment: " + amount);
        System.out.println("Internet Banking Account Number: " + accountNumber);
        System.out.println("Internet Banking Banl Name: " + bankName);
    }

}

public class semester {

    public static void main(String[] args) {

        Payment creditcard = new CreditCard(1234, "Yeasin", 50000);
        Payment mobileBanking = new MobileBanking("01627800198", "Airtel", 59990);
        Payment internetBanking = new InternetBanking("Brac Bank", "833474848", 89990);

        creditcard.processPayment();
        mobileBanking.processPayment();
        internetBanking.processPayment();

    }
}
