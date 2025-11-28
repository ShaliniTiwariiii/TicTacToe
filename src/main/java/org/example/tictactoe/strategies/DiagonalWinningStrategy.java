package org.example.tictactoe.strategies;

import org.example.tictactoe.Board;
import org.example.tictactoe.Move;

import java.util.HashMap;

public class DiagonalWinningStrategy implements WinningStrategy{
    private HashMap<String, Integer> leftDiagCount = new HashMap<>();
    private HashMap<String, Integer> rightDiagCount = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        int size = board.getSize();

        String symbol = move.getCell().getPlayer().getSymbol().getSym();
        if (row == col) {
            leftDiagCount.putIfAbsent(symbol, 0);
            leftDiagCount.put(symbol, leftDiagCount.get(symbol) + 1);

            if (leftDiagCount.get(symbol) == size) {
                return true;
            }
        }

        if (row + col == size - 1) {
            rightDiagCount.putIfAbsent(symbol, 0);
            rightDiagCount.put(symbol, rightDiagCount.get(symbol) + 1);

            if (rightDiagCount.get(symbol) == size) {
                return true;
            }
        }

        return false;
    }


    @Override
    public void handleUndo(Board board, Move move) {

    }
}