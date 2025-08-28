package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private String userName;
    private int position;

    public Player(String userName){
        this.position=0;
        this.userName = userName;
    }
}
