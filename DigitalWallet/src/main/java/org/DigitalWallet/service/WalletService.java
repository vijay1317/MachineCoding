package src.main.java.org.DigitalWallet.service;

import src.main.java.org.DigitalWallet.dao.*;
import src.main.java.org.DigitalWallet.entity.*;

import java.math.BigDecimal;
import java.util.Date;

public class WalletService {
    private WalletDao dao;

    public WalletService(){
        this.dao =  new WalletDao();
    }

    public void createWallet(String name, BigDecimal balance){
        Account account= new Account(name,balance);
        int accountNumber =  account.getAccountNumber();
        dao.getAccountMap().put(accountNumber,account);
        System.out.println("Wallet created successfully with username: "+ name+"Balance added: "+ balance);

    }

    public void transfer(int from, int to, BigDecimal transferAmount){
        if(!valid(from,to,transferAmount)) return;

        // fetching account object for provided account number.
        Account fromAccount =  dao.getAccountMap().get(from);
        Account toAccount =  dao.getAccountMap().get(to);

        if(fromAccount.getBalance().compareTo(transferAmount) < 0){ // transfer amount is more than the available balance (availableBalanceObject.compareTo(transferAmountObj) < 0)
            System.out.println("Insufficient Balance");
            return;
        }

        Transaction transaction = new Transaction(from, to,transferAmount);

        fromAccount.setBalance(fromAccount.getBalance().subtract(transferAmount));
        System.out.println("Balance withdraw  Successfully and send to "+ toAccount.getUser().getUserName());
        fromAccount.getTransactions().add(transaction);

        toAccount.setBalance(toAccount.getBalance().add(transferAmount));
        toAccount.getTransactions().add(transaction);
        System.out.println("Balance received  Successfully from  "+ fromAccount.getUser().getUserName());


        dao.getAccountMap().put(from,fromAccount);
        dao.getAccountMap().put(to,toAccount);

    }


    public void statement(int accountNumber){
        Account account = dao.getAccountMap().get(accountNumber);
        if(account==null){
            System.out.println("Invalid account Number.....");
            return;
        }

        System.out.println("summary for account number "+ accountNumber);
        System.out.println("Current account balance "+ account.getBalance() );
        System.out.println("Transactions are  "+ account.getTransactions());



    }
    public void overview() {
        for (int accNum : dao.getAccountMap().keySet()) {
            System.out.print("Balance for account number " + accNum + ": ");
            System.out.println(dao.getAccountMap().get(accNum).getBalance());
        }
    }

    private boolean valid(int from, int to,BigDecimal amount){
        if(!dao.getAccountMap().containsKey(from)) return false;
        if(!dao.getAccountMap().containsKey(to)) return false;
        if(from==to) return false;
        if(amount.compareTo(new BigDecimal(0.0001))<0) return false;

        return true;

    }

}
