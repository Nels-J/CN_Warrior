package equipments;

import characters.Sprite;
import characters.Warrior;
import surprise.Surprise;

public class Sword extends Weapon implements Surprise {

    public Sword() {
        super("Excalibur", "sword.png", 5);
    }

    @Override
    public void openSurprise(Sprite sprite) {
        int newAttackLevel = sprite.getAttackLevel() + 5;

        if ((sprite instanceof Warrior) && (newAttackLevel <= 10)) {
            sprite.setAttackLevel(newAttackLevel);
            System.out.println("+++ You've got a SWORD => 5 additional attack level added +++");
        } else {
            sprite.setAttackLevel(sprite.getMaxAttack());
            System.out.println("+++ You've got a SWORD => Strength set to MAX attack level +++");
        }
    }

}
