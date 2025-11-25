package org.example.tictactoe;

import org.example.tictactoe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {
    private static Scanner scanner=new Scanner(System.in);


    public Game startGame(){
         int dimension =getDimension();
        List<Player> players=getPlayers(dimension);
        List<WinningStrategy>winningStrategies=new ArrayList<>();
        return new Game(dimension,players,winningStrategies);
    }
    public GameState getGameState(Game game){
        return game.getGameState();
    }
    public void display(Game game){
        game.display();
    }
    public void makeMove(Game game){
        game.makeMove();
    }
    public String getWinner(Game game){
        return game.getWinner().getName();
    }
    private int getDimension(){
        System.out.print("Enter number of dimension: ");
        int dimension=scanner.nextInt();
        return dimension;
    }

    private List<Player>getPlayers(int dimension){
        System.out.print("Enter number of players: ");
        scanner.nextLine();
        List<Player> players=new ArrayList<>();
        for(int i=0;i<dimension-1;i++){
            System.out.println("\nIs Player "+(i+1)+" a HUMAN or BOT?(H/B):");

            String type=scanner.nextLine().trim().toUpperCase();
            if(type.equals("H")){
                System.out.print("Enter Human details: <Name> <Symbol> ");
                String details=scanner.nextLine();
                String[] detailsArray=details.split(" ");
                Player player=new Human(i,detailsArray[0],PlayerType.HUMAN,new Symbol(detailsArray[1]));

            players.add(player);}
            else if(type.equals("B")){
                System.out.print("Enter Human details: <Name> <Symbol><Difficulty(E/M/H)> ");
                String details=scanner.nextLine();
                String[] arr=details.split(" ");
                if (arr.length < 3) {
                    System.out.println("Invalid input. Example: Bot1 O M");
                    i--;
                    continue;
                }
                BotDifficultyLevel difficulty=switch (arr[2].toUpperCase()){
                    case "E" -> BotDifficultyLevel.Easy;
                    case "H" -> BotDifficultyLevel.Hard;
                    case "M" -> BotDifficultyLevel.Medium;
                    default -> BotDifficultyLevel.Easy;
                };
                Player bot=new Bot(i,arr[0],PlayerType.BOT,new Symbol(arr[1]),difficulty);
                players.add(bot);
            }

           else{
               System.out.println("Invalid Input, try again");
            }

        }

        return players;
    }
}
