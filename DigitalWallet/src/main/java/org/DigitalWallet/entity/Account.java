package src.main.java.org.DigitalWallet.entity;

import src.main.java.org.DigitalWallet.util.AccountNumberGenerator;

import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

public class Account {
    private int accountNumber;
    private User user;
    private BigDecimal balance;
    private Set<Transaction> transactions;

    public Account(String name, BigDecimal balance){
         this.accountNumber = AccountNumberGenerator.generateAccountNumber();
         this.user = new User(name);
         this.balance =  balance;
         this.transactions = new TreeSet<>((a,b)->a.getDate().compareTo(b.getDate()));

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", user=" + user +
                ", balance=" + balance +
                ", transactions=" + transactions +
                '}';
    }

    public BigDecimal getBalance() {
        return balance;
    }



    public void setUser(User user) {
        this.user = user;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
