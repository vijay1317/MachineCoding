package TicTacToe;

import TicTacToe.PlayerStrategy.PlayerStrategy;

public class Player {
    Symbol symbol;
    PlayerStrategy playerStrategy;

    public Player(Symbol symbol, PlayerStrategy playerStrategy){
        this.playerStrategy = playerStrategy;
        this.symbol =symbol;
    }

    public PlayerStrategy getPlayerStrategy() {
        return this.playerStrategy;
    }

    public Symbol getSymbol() {
        return this.symbol;
    }
}
