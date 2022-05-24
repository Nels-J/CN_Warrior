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
            System.out.println("You get a troubleshooting: " + error.getMessage());
            System.exit(1);
        }
    }

    private static GameStatus playGame() {
        try {
            Game game = new Game();
            game.init();
            return GameStatus.LOOSE;
        } catch (LooseException looseException) {
            System.out.println(looseException.getMessage());
            return GameStatus.LOOSE;
        } catch (WinException winException) {
            System.out.println(winException.getMessage());
            return GameStatus.WIN;
        }
    }
}