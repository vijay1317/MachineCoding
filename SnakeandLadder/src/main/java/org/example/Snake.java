package org.example;

public class Snake extends Move{
    public Snake(int start, int end){
        super(start,end);
    }

    @Override
    public String getEncounterMessage() {
        return "Oops.. Bitten By Snake";
    }


}
