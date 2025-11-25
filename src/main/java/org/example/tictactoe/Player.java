package org.example.tictactoe;

public abstract class Player {
    private Integer id;
    private String name;
    private Symbol symbol;
    private PlayerType playerType;
    public Player(Integer id, String name, PlayerType playerType, Symbol symbol) {
        this.id = id;
        this.name=name;
        this.playerType=playerType;
        this.symbol=symbol;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {

    }
    public Symbol getSymbol() {
        return symbol;
    }
    public String getName() {
        return name;
    }
}
