package gamestuff;

public class Game {
    //ATTRIBUT(s)
    private GameMap gameMap;
    private int playerPosition;
    private Character character;
    private Dice dice;

    // CONSTRUCTOR(s)
    public Game() {
        this.gameMap = new GameMap();
        this.playerPosition = 0;
        this.dice = new Dice();
    }

    // GETTER(s)/SETTER(s)
    public GameMap getGameMap() {
        return gameMap;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    public Dice getDice() {
        return dice;
    }

    // METHOD(s)
    public void init() {
        System.out.println("Game engine started");
        Menu menu = new Menu();
        menu.mainMenu();
    }

    public void beginGame() {

    }
}
