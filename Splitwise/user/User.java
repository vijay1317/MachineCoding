package Splitwise.user;

public class User {
    String userid;
    String userName;
    UserExpenseBalanceSheet userExpenseBalanceSheet;

    public User(String userid, String userName) {
        this.userid = userid;
        this.userName = userName;
        this.userExpenseBalanceSheet = new UserExpenseBalanceSheet();
    }
    public String getUserid(){
        return this.userid;
    }

    public UserExpenseBalanceSheet getUserExpenseBalanceSheet() {
        return userExpenseBalanceSheet;
    }
}
