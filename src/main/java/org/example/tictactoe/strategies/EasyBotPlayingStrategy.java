package org.example.tictactoe.strategies;

import org.example.tictactoe.*;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {
    public Move makeMove(Board board, Player player) {
        for(List< Cell> row:board.getGrid()){
            for(Cell cell:row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return new Move(new Cell(cell.getRow(),cell.getCol()),player);
                }
            }
        }
        return null;
    }
}
