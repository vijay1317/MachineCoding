package org.example;

public class Dice {
    public static  int roll(int cnt){
        return (int)((Math.random()*6*cnt)+1);
    }
}
