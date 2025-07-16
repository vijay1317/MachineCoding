package parkinglot.payment;

public class CashPaymentStrategy implements PaymentStategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("processing cash payment.."+ amount);
    }
}
