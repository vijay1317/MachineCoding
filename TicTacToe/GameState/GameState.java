package TicTacToe.GameState;

import TicTacToe.GameContext;
import TicTacToe.Player;

public interface GameState {
    public void next(GameContext gameContext, Player player, boolean hasWon);
    public boolean isGameOver();
}
