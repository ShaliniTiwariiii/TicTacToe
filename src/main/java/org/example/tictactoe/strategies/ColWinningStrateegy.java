package org.example.tictactoe.strategies;

import org.example.tictactoe.Board;
import org.example.tictactoe.Move;
import org.example.tictactoe.Player;

import java.util.HashMap;

public class ColWinningStrateegy implements WinningStrategy {
    private HashMap<Integer, HashMap<String, Integer>> colCount = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int col = move.getCell().getCol();
        String symbol = move.getCell().getPlayer().getSymbol().getSym();

        if(!colCount.containsKey(col)) {
            colCount.put(col, new HashMap<>());
        }
        if(!colCount.get(col).containsKey(symbol)) {
            colCount.get(col).put(symbol, 0);
        }
        // increase the frequency
        colCount.get(col).put(symbol, colCount.get(col).get(symbol) + 1);

        return colCount.get(col).get(symbol) == board.getSize();
    }
    @Override
    public void handleUndo(Board board, Move move) {
        int col = move.getCell().getRow();
        String symbol = move.getPlayer().getSymbol().getSym();

        colCount.get(col).put(symbol, colCount.get(col).get(symbol) - 1);
    }
}
