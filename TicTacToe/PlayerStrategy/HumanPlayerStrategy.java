package TicTacToe.PlayerStrategy;

import TicTacToe.Board;
import TicTacToe.Position;

import java.util.Scanner;

public class HumanPlayerStrategy implements PlayerStrategy {

    private Scanner sc;
    private String playerName;

    public HumanPlayerStrategy(String name){
        this.playerName= name;
        sc = new Scanner(System.in);
    }


    @Override
    public Position makeMove(Board board) {
        while(true){
            System.out.printf(" %s Enter row [0-2] and col [0-2]",playerName);

            int row = sc.nextInt();
            int col = sc.nextInt();
            Position move = new Position(row,col);

            if(board.isValidMove(move)){
                return  move;
            }else{

                System.out.print("Invalide Move please make a valid move ");
            }

        }
    }
}
