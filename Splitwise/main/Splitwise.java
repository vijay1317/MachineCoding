package Splitwise.main;

import Splitwise.user.UserController;

public class Splitwise {
    UserController userController;
    GroupController groupController;
    BalanceSheetController balanceSheetController;
    Splitwise(){
        userController = new UserController();
        groupController = new GroupController();
        balanceSheetController = new BalaceSheetController();
    }


    public void demo(){
        setupAndGroup();
    }

    public void setupAndGroup(){
        addUserToSplitwiseApp();

        User user1 = userController.getUser("U1001");
        groupController.createNewGroup("G001","Outing with Friends",user1);
    }

    public void addUserToSplitwiseApp(){
        User user1 = new User("U1001","User1");

        User user2 = new User("U2001","User2");
        User user3 = new User("U3001","User3");
        userController.add(user1);
        userController.add(user2);
        userController.add(user3);


    }
}
