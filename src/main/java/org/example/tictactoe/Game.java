package org.example.tictactoe;

import org.example.tictactoe.strategies.WinningStrategy;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private GameState gameState;
    private Player winner;
    private int nextPlayerIndex;
    private List <WinningStrategy> winningStrategies;
    private List<Move> moves;
}
