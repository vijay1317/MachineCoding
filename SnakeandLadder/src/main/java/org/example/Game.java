package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Game {
    private Board board;
    private Queue<Player> players;

    public Game(int dimension){
        this.board = new Board(dimension);
        players = new LinkedList<>();
    }

    public void addPlayer(String name){
        players.add(new Player(name));
    }

    public void launchGame(){
        System.out.println("Starting Snake and Ladder Game!");
        boolean winnerFound = false;
        Scanner sc = new Scanner(System.in);

        while(!winnerFound){

           Player currentPlayer = players.poll();
            System.out.println(currentPlayer.getUserName()+ "s Turn current Positon"+currentPlayer.getPosition());
            System.out.println("Press Enter to Roll the Dice !!");
            sc.nextLine();

            int diceValue = Dice.roll(1);
            System.out.println("Rolled : "+diceValue);

            int nextPos = currentPlayer.getPosition() + diceValue;
            if(nextPos > board.getSize()){
                System.out.println("Rolled too high! Staying at " + currentPlayer.getPosition());
            }else{
                //Handle the snake and Ladder Case
                if(board.hasSnakeOrLadder(nextPos)){
                   Move entity = board.getEntity(nextPos);
                   System.out.println(entity.getEncounterMessage());
                   nextPos =  entity.getEndPosition();

                }
                currentPlayer.setPosition(nextPos);
                System.out.println(currentPlayer.getUserName() + " moved to " + nextPos);

                if(nextPos == board.getSize()){
                    System.out.println(currentPlayer.getUserName()+"..Wins!");
                    winnerFound =true;
                    break;
                }


            }
            players.add( currentPlayer);



        }
        sc.close();
    }

}
