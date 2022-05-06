package gamestuff;

public class Dice {
    int dice;

    public Dice() {
        this.dice = dice;
    }

    public int launchDice() {
        double launch = Math.random() * 6 + 1;
        dice = (int) launch;
        System.out.println( "Dédé est de :" + dice );
        return dice;
    }
}
