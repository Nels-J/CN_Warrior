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
        sprite = menu.mainMenu();
        //start(sprite);
    }

    public void start() {
        try {
            gameMap.turnTest(64);
            while (getPlayerPosition() < gameMap.getCells().size()) {
                newTurn();
                if (getPlayerPosition() >= gameMap.getCells().size()) {
                    throw new CustomExceptions("Congratulations you win !");
                } else {
                    System.out.println("New position is: " + (getPlayerPosition() + 1));
                }
            }
        } catch(CustomExceptions isWin){
            System.out.println(isWin);
        }
    }

    public void newTurn(){
        System.out.println("Actual position is: " + (getPlayerPosition() + 1));
        dice.launchDice();
        System.out.println("Dice result: " + getDice().dice);
        playerPosition += getDice().dice;
    }
}