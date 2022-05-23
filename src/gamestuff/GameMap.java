package gamestuff;

import characters.Dragon;
import characters.Goblin;
import characters.Wizard;
import equipments.Potion;
import equipments.Spell;
import equipments.Sword;
import surprise.Surprise;

import java.util.Arrays;
import java.util.List;

public class GameMap {

    // ATTRIBUTE(s)
    private List<Surprise> cells;
    private int gameMapTotalCells;


    // CONSTRUCTOR(s)
    public GameMap() {
        this.gameMapTotalCells = 64;
        this.cells = Arrays.asList(new Surprise[64]);
        generate();
    }

    private void generate() {
        for (int i : new int[]{45, 52, 56, 62}) {
            this.cells.set(i, new Dragon());
        }
        for (int i : new int[]{10, 20, 25, 32, 35, 36, 37, 40, 44, 47}) {
            this.cells.set(i, new Wizard());
        }
        for (int i : new int[]{3, 6, 9 , 12, 15, 18, 21, 24, 27, 30}) {
            this.cells.set(i, new Goblin());
        }
        for (int i : new int[]{19, 26, 42, 53}) {
            this.cells.set(i, new Sword());
        }
        for (int i : new int[]{1, 4 , 8, 17, 23}) {
            this.cells.set(i, new Spell());
        }
        for (int i : new int[]{48, 49}) {
            this.cells.set(i, new Spell()); //TODO replace it to spell fireballs
        }
        for (int i : new int[]{7, 13, 31, 33, 39, 43}) {
            this.cells.set(i, new Potion());
        }
        for (int i : new int[]{28, 41}) {
            this.cells.set(i, new Potion()); //TODO replace it to potion big Potion
        }
    }


    // GETTER(s) & SETTER(s)

    public List<Surprise> getCells() {
        return cells;
    }


    // METHOD(s)

    @Override
    public String toString() {
        return "GameMap{" +
                "cells=" + cells +
                ", gameMapTotalCells=" + gameMapTotalCells +
                '}';
    }
}
