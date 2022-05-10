package gamestuff;

public class Dice implements DiceInterface {
    // Declarations
    int dice;

    // Constructor
    public Dice() {
    }

    // Random method without using Random class
    public int launchDice() {
        double launch = Math.random() * 6 + 1;
        return dice = (int) launch;
        // System.out.println( "Dédé est de :" + dice );
        //return dice;
    }
}
