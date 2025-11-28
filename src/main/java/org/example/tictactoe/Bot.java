package org.example.tictactoe;

import org.example.tictactoe.strategies.BotPlayingStrategy;
import org.example.tictactoe.strategies.BotPlayingStrategyFactory;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(Integer id, String name, PlayerType playerType, Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
        super(id, name, playerType, symbol);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategyByDifficultyLevel(botDifficultyLevel);
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println("Hey " + getName() + " It's you turn! Please make the move.");
        return botPlayingStrategy.makeMove(board, this);
    }
}