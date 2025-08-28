package TicTacToe;

import java.util.Arrays;

public class Board {
    Symbol[][] grid;
    private final int row ;
    private final int col;
     public Board(int row , int col){
         this.row =row;
         this.col = col;

         grid = new Symbol[row][col];

         for(Symbol[] a:grid){
             Arrays.fill(a,Symbol.EMPTY);
         }
     }

     public boolean isValidMove(Position position){
        int curRow = position.getRow();
        int curCol = position.getCol();

       return (curRow>=0 && curRow < row && curCol>=0 && curCol < col && grid[curRow][curCol] == Symbol.EMPTY);
     }

     public void makeMove(Position position,Symbol symbol){
         if(isValidMove(position)){
             grid[position.getRow()][position.getCol()] =symbol;
         }
     }

     public void checkGameState(GameContext gameContext, Player currentPlayer){
         // check any row is marked as winning
         for(int i=0;i<row;i++){
             if(grid[i][0]!=Symbol.EMPTY && isWinningLine(grid[i])){
                 gameContext.next(currentPlayer,true);
                 return ;
             }
         }

         // check any colum is marked as winning line

            Symbol[] colArr = new Symbol[row];
            for(int j=0;j<col;j++){
                for(int i=0;i<row;i++){
                    colArr[i] = grid[i][j];
                }
                if(grid[0][j]!=Symbol.EMPTY && isWinningLine(colArr)){
                    gameContext.next(currentPlayer,true);
                }
            }

         // check any  of two diagonal  marked as winning line



     }

     public boolean isWinningLine(Symbol[] arr){
         int n = arr.length;

         Symbol initialSymbol =  arr[0];

         for(int i=1;i<n;i++){
             if(arr[i]!=initialSymbol){
                 return false;
             }

         }
         return true;
     }


}
