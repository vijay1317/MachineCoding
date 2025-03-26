package src.main.java.org.DigitalWallet.dao;

import src.main.java.org.DigitalWallet.entity.Account;

import java.util.HashMap;
import java.util.Map;

public class WalletDao {

    private Map<Integer, Account> accountMap; // map<accntNumber,AccoutnObject>

    public WalletDao(){
        this.accountMap = new HashMap<>();
    }

    public Map<Integer, Account> getAccountMap() {
        return accountMap;
    }

    public void setAccountMap(Map<Integer, Account> accountMap) {
        this.accountMap = accountMap;
    }
}
