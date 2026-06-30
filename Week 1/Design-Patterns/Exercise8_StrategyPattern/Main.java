package exercise8;

public class Main {

    public static void main(String[] args) {

        PaymentContext paymentContext =
                new PaymentContext(
                        new CreditCardPayment()
                );

        paymentContext.makePayment(5000);

        paymentContext.setStrategy(
                new PayPalPayment()
        );

        paymentContext.makePayment(2500);
    }
}