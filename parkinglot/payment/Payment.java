package parkinglot.payment;

public class Payment {
    private double amount;
    private PaymentStategy paymentStategy;

    public Payment(double amount,PaymentStategy paymentStategy){
        this.amount =  amount;
        this.paymentStategy = paymentStategy;
    }

    public void processPayment(){
        if(amount>0){
            paymentStategy.processPayment(amount);
        }else{
            System.out.println("Invalid payment amount");
        }
    }
}
