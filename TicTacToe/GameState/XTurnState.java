package TicTacToe.GameState;

import TicTacToe.GameContext;
import TicTacToe.Player;
import TicTacToe.Symbol;

public class XTurnState implements GameState{
    @Override
    public void next(GameContext gameContext, Player player, boolean hasWon) {
        if(hasWon){
            gameContext.setState(player.getSymbol()== Symbol.X?new XWonState():new OWonState());
        }else{
            gameContext.setState(new OTurnState());
        }
    }

    @Override
    public boolean isGameOver() {
        return false;
    }
}
