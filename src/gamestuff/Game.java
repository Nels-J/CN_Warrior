package gamestuff;

import characters.Sprite;

public class Game {

    //ATTRIBUTE(s)
    private Menu menu;
    private GameMap gameMap;
    private Sprite sprite;
    private Dice dice;
    private int playerPosition;


    // CONSTRUCTOR(s)
    public Game() {
        this.menu = new Menu();
        this.gameMap = new GameMap();
        this.sprite = null;
        this.dice = new Dice();
        this.playerPosition = 0;
    }

    public Game(Sprite sprite) {
        this.menu = new Menu();
        this.gameMap = new GameMap();
        this.sprite = sprite;
        this.dice = new Dice();
        this.playerPosition = 0;
    }


    // GETTER(s)/SETTER(s)

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public GameMap getGameMap() {
        return gameMap;
    }

    public void setGameMap(GameMap gameMap) {
        this.gameMap = gameMap;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }


    // METHOD(s)

    public void init() {
        System.out.println("Game engine started");
        sprite = menu.mainMenu();
        start();
    }

    public void start() {
        gameMap.turnTest(4);
        System.out.println(gameMap);
        newTurn();
    }

    public void newTurn() {
        System.out.println("Actual position is: " + getPlayerPosition());
        dice.launchDice();
        System.out.println("Dice result: " + getDice().dice);
        playerPosition += getDice().dice;
        System.out.println("New position is: " + getPlayerPosition());
    }
}
