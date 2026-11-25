
class Payment {

    void processPayment() {
        System.out.println("Processing payment...");
    }
}

class CashPayment extends Payment {

    @Override
    void processPayment() {
        System.out.println("Payment received in cash.");
    }
}

class OnlinePayment extends Payment {

    @Override
    void processPayment() {
        System.out.println("Payment completed through online banking.");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        Payment payment1 = new CashPayment();
        Payment payment2 = new OnlinePayment();

        System.out.println("=== POLYMORPHISM DEMO ===");

        payment1.processPayment();
        payment2.processPayment();
    }
}
