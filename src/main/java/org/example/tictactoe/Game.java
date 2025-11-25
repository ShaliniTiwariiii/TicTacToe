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
    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
    public Player getWinner() {
        return winner;
    }
    public void validateMove(Move move){
        int row=move.getCell().getRow();
        int col=move.getCell().getCol();
        if(row<0||row>getBoard().getSize()||col<0||col>getBoard().getSize()){
            throw new RuntimeException("Invalid move.");
        }
        if(getBoard().getCell(row,col).getCellState().equals(CellState.FILLED)){
            throw new RuntimeException("Invalid move.");
        };
    }
    public void updateGame(Move move,Player currentPlayer){
        int row=move.getCell().getRow();
        int col=move.getCell().getCol();
        Cell actualCell=getBoard().getCell(row,col);
        actualCell.setPlayer(currentPlayer);
        actualCell.setCellState(CellState.FILLED);
        nextPlayerIndex++;
        nextPlayerIndex %=players.size();
        move.setCell(actualCell);
        moves.add(move);
    }
    public  boolean checkWinner(Move move){
        for(WinningStrategy strategy:winningStrategies){
           if(strategy.checkWinner(getBoard(),move)){
               return true;
           }

        }
        return false;
    }
    public boolean checkDraw(){
        return moves.size()==board.getSize()*board.getSize();
    }
    public void makeMove(){
        Player currentPlayer=players.get(nextPlayerIndex);
        currentPlayer.makeMove(board);
        Move move=currentPlayer.makeMove(board);

        try{
            validateMove(move);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return;
        }
        updateGame(move,currentPlayer);
        if(checkWinner(move)){
            winner=currentPlayer;
            setGameState(GameState.SUCCESS);
        }
        else if(checkDraw()){
            setGameState(GameState.DRAW);
        }
    }
}
