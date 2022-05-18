package gamestuff;

public class Dice implements DiceInterface {
    // Declarations
    int dice;

    // Constructor
    public Dice() {
    }

    // Random method without using Random class
    public int launchDice() {
        double launch = Math.random() * 4 + 1;
        return dice = (int) launch;

    }
    @Override
    public String toString() {
        return "Dice{" +
                "dice=" + dice +
                '}';
    }
}
