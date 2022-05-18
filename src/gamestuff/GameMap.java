package gamestuff;

import java.util.ArrayList;

public class GameMap {

    // ATTRIBUTE(s)
    private ArrayList<Integer> cells;  //TODO refacto + tard en ArrayList
    private int gameMapTotalCells;


    // CONSTRUCTOR(s)
    public GameMap() {
        this.gameMapTotalCells = 4;
        this.cells = new ArrayList<Integer>(gameMapTotalCells);
    }

    public GameMap(int gameMapTotalCells) {
        this.gameMapTotalCells = gameMapTotalCells;
        this.cells = new ArrayList<Integer>(gameMapTotalCells);
    }

    // GETTER(s) & SETTER(s)

    public ArrayList<Integer> getCells() {
        return cells;
    }

    public void setCells(ArrayList<Integer> cells) {
        this.cells = cells;
    }

    public int getGameMapTotalCells() {
        return gameMapTotalCells;
    }

    public void setGameMapTotalCells(int numberOfCells) {
        this.gameMapTotalCells = gameMapTotalCells;
    }


    // METHOD(s)


    @Override
    public String toString() {
        return "GameMap{" +
                "cells=" + cells +
                ", gameMapTotalCells=" + gameMapTotalCells +
                '}';
    }

    //TODO avancer le pion arbitrairement
    public void turnTest(int gameMapTotalCells) {
        for (int idx = 0; idx < gameMapTotalCells ; idx++) {
            getCells().add(idx,idx+1);
        }
    }
}
