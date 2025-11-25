package org.example.tictactoe;

import org.example.tictactoe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private GameState gameState;
    private Player winner;
    private int nextPlayerIndex;
    private List <WinningStrategy> winningStrategies;
    private List<Move> moves;
    public Game(int dimension,List<Player> players,List<WinningStrategy> winningStrategies ){
        this.board=new Board(dimension);
        this.players=players;
        this.winningStrategies=winningStrategies;
        this.gameState=GameState.IN_PROGRESS;
        this.winner=null;
        this.moves=new ArrayList<>();
        this.nextPlayerIndex=0;

    }
    public void display(){
        board.display();
    }
    public Board getBoard() {
        return board;
    }
    public void setBoard(Board board) {
        this.board = board;
    }
    public GameState getGameState() {
        return gameState;
    }
    public Player getWinner() {
        return winner;
    }
}
