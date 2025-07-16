package DigitalWallet.src.main.java.org.DigitalWallet.entity;

import java.util.UUID;

public class User {
    String id;
    String userName;

    public User(String userName){
        this.userName = userName;
        this.id  = UUID.randomUUID().toString();
    }

    public String getId(){
        return this.id;
    }
    public String getUserName(){
        return this.userName;
    }
    public void setId(String id){
        this.id = id;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }


}
