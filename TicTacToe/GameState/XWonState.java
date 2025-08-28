package TicTacToe.GameState;

import TicTacToe.GameContext;
import TicTacToe.Player;

public class XWonState implements GameState{
    @Override
    public void next(GameContext gameContext, Player player, boolean hasWon) {
        //no need to do anything
    }

    @Override
    public boolean isGameOver() {
        return true;
    }
}
