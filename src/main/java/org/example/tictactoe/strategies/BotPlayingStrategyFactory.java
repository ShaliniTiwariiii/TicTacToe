package org.example.tictactoe.strategies;

import org.example.tictactoe.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel){
                BotPlayingStrategy botPlayingStrategy = null;
                if(botDifficultyLevel==BotDifficultyLevel.Easy){
                    botPlayingStrategy = new EasyBotPlayingStrategy();
                }else if(botDifficultyLevel==BotDifficultyLevel.Medium){
                    botPlayingStrategy = new MediumBotPlayingStrategy();
                }else if(botDifficultyLevel==BotDifficultyLevel.Hard){
                    botPlayingStrategy = new HardBotPlayingStrategy();
                }
                return botPlayingStrategy;
                }
    }
