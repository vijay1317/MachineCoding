package src.main.java.org.DigitalWallet.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private int from;
    private int to;
    private BigDecimal amount;
    private LocalDateTime date;

    public Transaction(int from , int to, BigDecimal amount){
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.date = LocalDateTime.now();
    }

    public int getFrom() {
        return from;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "from=" + from +
                ", to=" + to +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
