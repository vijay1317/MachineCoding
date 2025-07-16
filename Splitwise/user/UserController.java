package Splitwise.user;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> userList;

    public UserController(){
        userList = new ArrayList<>();
    }
    public void addUser(User user){
        userList.add(user);
    }

    public User getUser(String userId){
        for(User user:userList){
            return (user.getUserid().equals(userId))?user:null;
        }
        return null;
    }

    public List<User> getAllUsers(){
        return userList;
    }
}
