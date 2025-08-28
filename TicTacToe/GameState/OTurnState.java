package TicTacToe.GameState;

import TicTacToe.GameContext;
import TicTacToe.Player;
import TicTacToe.Position;
import TicTacToe.Symbol;

public class OTurnState implements GameState{
    @Override
    public void next(GameContext gameContext, Player player, boolean hasWon) {

        if(hasWon) {
            gameContext.setState(player.getSymbol()== Symbol.X?new XWonState():new OWonState());
        }else{
            gameContext.setState(new XTurnState());
        }

    }

    @Override
    public boolean isGameOver() {
        return false;
    }
}
