package equipments;

import characters.Sprite;
import surprise.Surprise;

public class Sword extends Weapon implements Surprise {

    public Sword() {
        super("Excalibur", "sword.png", 5);
    }

    @Override
    public void openSurprise(Sprite sprite) {
    }

}
