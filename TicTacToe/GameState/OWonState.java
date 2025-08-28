package TicTacToe.GameState;

import TicTacToe.GameContext;
import TicTacToe.Player;

public class OWonState implements GameState{
    @Override
    public void next(GameContext gameContext, Player player, boolean hasWon) {
        //Now Next State
    }

    @Override
    public boolean isGameOver() {
        return true;
    }
}
