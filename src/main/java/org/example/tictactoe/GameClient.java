package org.example.tictactoe;

import java.util.Scanner;

public class GameClient {
    public  static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
    System.out.println("We will play the game here!");
    GameController gameController = new GameController();

    Game game=gameController.startGame();
    gameController.display(game);
    while(gameController.getGameState(game).equals(GameState.IN_PROGRESS)){
        gameController.display(game);
        gameController.makeMove(game);
    }
    if(gameController.getGameState(game).equals(GameState.SUCCESS)){
        System.out.println("Winner is: "+gameController.getWinner(game));
    }else if(gameController.getGameState(game).equals(GameState.DRAW)){
        System.out.println("Game is draw");
        }
    }
}
