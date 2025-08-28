package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Move {
    int startPosition;
    int endPosition;

    public Move(int start, int end){
        this.startPosition = start;
        this.endPosition = end;
    }

    public abstract String getEncounterMessage();

}
