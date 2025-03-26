package src.main.java.org.DigitalWallet.util;

public class AccountNumberGenerator {
    public static int cnt = 0;

    public static   int generateAccountNumber(){
        cnt++;
        return cnt;
    }
}
