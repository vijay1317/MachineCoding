package TicTacToe.PlayerStrategy;

import TicTacToe.Board;
import TicTacToe.Position;

public interface PlayerStrategy {
    Position makeMove(Board board);
}
