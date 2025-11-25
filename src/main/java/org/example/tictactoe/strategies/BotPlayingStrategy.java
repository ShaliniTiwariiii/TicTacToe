package org.example.tictactoe.strategies;

import org.example.tictactoe.Board;
import org.example.tictactoe.Move;
import org.example.tictactoe.Player;

public interface BotPlayingStrategy {
    public Move makeMove(Board board, Player player);
}
