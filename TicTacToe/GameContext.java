package TicTacToe;

import TicTacToe.GameState.GameState;
import TicTacToe.GameState.XTurnState;


public class GameContext {
    private  GameState currentState;

    public GameContext(){
        this.currentState = new XTurnState();
    }

    public void setState(GameState gameState){
        this.currentState = gameState;
    }

    public void next(Player player,boolean hasWon){
        currentState.next(this,player,hasWon);
    }
    public boolean isGameOver(){
        return currentState.isGameOver();
    }

    public GameState getCurrentState(){
        return currentState;
    }
}
