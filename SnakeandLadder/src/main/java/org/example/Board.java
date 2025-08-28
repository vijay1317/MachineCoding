package org.example;

import java.util.HashMap;

public class Board {
    private int size;
    private HashMap<Integer,Move> entities ;

    public Board(int dimension){
        this.size = dimension * dimension;
        entities = new HashMap<>();

        // Example: Hard-coded snakes and ladders
        // Snakes go from start (higher) to end (lower)
        putEntity(new Snake(17, 7));
        putEntity(new Snake(54, 34));
        putEntity(new Snake(62, 19));
        putEntity(new Snake(98, 79));

        // Ladders go from start (lower) to end (higher)
        putEntity(new Ladder(3, 22));
        putEntity(new Ladder(5, 8));
        putEntity(new Ladder(20, 29));
        putEntity(new Ladder(27, 56));
    }

    public boolean hasSnakeOrLadder(int position){
        return entities.containsKey(position);
    }

    public Move getEntity(int position){

        return entities.get(position);
    }

    public int getSize(){
        return this.size;
    }
    public void putEntity(Move move) {
        entities.put(move.getStartPosition(), move);
    }



}
