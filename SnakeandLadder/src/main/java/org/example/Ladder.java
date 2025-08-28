package org.example;

public class Ladder extends Move{

    public Ladder(int start, int end){
        super(start,end);
    }
    @Override
    public String getEncounterMessage() {
        return "Yay.. Got Ladder";
    }
}
