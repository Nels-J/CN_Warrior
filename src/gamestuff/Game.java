package gamestuff;

import characters.Sprite;
import surprise.Surprise;

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
    public void init() throws WinException {
        setSprite(sprite = menu.mainMenu());
        start(getSprite());
    }

    public void start(Sprite sprite) throws WinException{
            while (getPlayerPosition() < gameMap.getCells().size()) {
                newTurn();
                if (getPlayerPosition() >= gameMap.getCells().size()) {
                    throw new WinException("Congratulations you win !");
                } else {
                    System.out.println("New position is: " + (getPlayerPosition() + 1));
                }
            }
    }

    public void newTurn(){
        System.out.println("Actual position is: " + (getPlayerPosition() + 1));
        int i = dice.launchDice();
        System.out.println("Dice result: " + i);
        setPlayerPosition(playerPosition += i);

        Surprise cell = gameMap.getCells().get(playerPosition);
        cell.openSurprise(sprite);
    }
}