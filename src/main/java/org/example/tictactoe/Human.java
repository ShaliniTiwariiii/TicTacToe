package org.example.tictactoe;

import java.util.Scanner;

public class Human extends Player {
    private int level;
    private int coins;
    private static Scanner sc=new Scanner(System.in);
    public Human(Integer id,String name,PlayerType playerType,Symbol symbol) {
        super(id,name,playerType,symbol);
        level=1;
        coins=50;
    }
    public Move makeMove(Board board) {
        System.out.println("Hey!"+getName()+"It's your move.");
        System.out.println("Please enter the row");
        int row=sc.nextInt();
        System.out.println("Please enter the column");
        int column=sc.nextInt();
        return new Move(new Cell(row,column),this);
    }
}
