package org.example.tictactoe.strategies;

import org.example.tictactoe.Board;
import org.example.tictactoe.Move;

public interface WinningStrategy {
    public boolean checkWinner(Board board, Move move);
    public void handleUndo(Board board , Move move);

}
