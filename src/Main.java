import gamestuff.*;
// Game engine (Main)
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the game!");
        Game game = new Game();
        try {
            game.init();
        }catch(QuitException userQuit) {
            System.out.println("You decide to leave bye!");
            System.exit(0); //ASK status unix a voir
        }catch(Exception error) {
            System.out.println("You get an troubleshooting:" + error.getMessage());
            System.exit(1);
        }
    }
}