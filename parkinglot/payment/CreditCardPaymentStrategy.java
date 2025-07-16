package parkinglot.payment;

public class CreditCardPaymentStrategy implements PaymentStategy{
    @Override
    public void processPayment(double payment) {
        System.out.println("Processing payment using card"+payment);
    }
}
