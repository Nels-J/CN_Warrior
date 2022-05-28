package gamestuff;

import characters.Sprite;
import database.Database;
import surprise.Surprise;

public class Game {
    //ATTRIBUTE(s)
    private Menu menu;
    private GameMap gameMap;
    private Sprite sprite;
    private Dice dice;
    private int playerPosition;
    private Database myConnexion;


    // CONSTRUCTOR(s)
    public Game() {
        this.myConnexion = new Database();
        this.menu = new Menu();
        this.gameMap = new GameMap();
        this.sprite = null;
        this.dice = new Dice();
        this.playerPosition = 0;
    }

    // GETTER(s)/SETTER(s)

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }


    // METHOD(s)
    public void init() throws WinException, LooseException {
        //myConnexion.loadDatabase();
        setSprite(sprite = menu.mainMenu());
        while (getPlayerPosition() < gameMap.getCells().size()) {
            newTurn();
        }
    }

    public void newTurn() throws WinException, LooseException {
        System.out.println("\nActual position is: " + (getPlayerPosition() + 1));
        int i = dice.launchDice();
        System.out.println("Dice result: " + i);
        setPlayerPosition(playerPosition += i);
        if (getPlayerPosition() >= gameMap.getCells().size()) {
            throw new WinException("!!!!!   Congratulations you WIN   !!!!!\n");
        }
        Surprise cell = gameMap.getCells().get(playerPosition);
        if (cell != null) {
            System.out.println("** Life: " + getSprite().getNumberOfLife() + " and Strength : " + getSprite().getAttackLevel() + " **");
            System.out.println("***** Opening surprise *****");
            cell.openSurprise(sprite);
            if (getSprite().getNumberOfLife() < 1) {
                throw new LooseException("LOOSER - GAME OVER!!!!\n");
            }
        } else {
            System.out.println("***** Nothing here... *****\n");
        }
    }
}