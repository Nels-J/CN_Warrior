import gamestuff.*;

// Game engine (Main)
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the game!");
        try {
            while (true) {
                playGame();
            }
        } catch (QuitException userQuit) {
            System.out.println("You decide to leave bye!");
            System.exit(0);
        } catch (Exception error) {
            System.out.println("You get an troubleshooting:" + error.getMessage());
            System.exit(1);
        }
    }

    private static GameStatus playGame() {
        try {
            Game game = new Game();
            game.init();
            return GameStatus.LOOSE;
        } catch (WinException winException) {

            return GameStatus.WIN;
        }
    }
}