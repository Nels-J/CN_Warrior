package characters;

import gamestuff.LooseException;
import gamestuff.WinException;
import surprise.Surprise;

public class Goblin extends Sprite implements Surprise {

    public Goblin() {
        super("default Goblin", "gob.png", 6, 1, 0, 0);
    }

    public Goblin(String name) {
        super(name, "gob.png", 6, 1, 0, 0);
    }

    @Override
    public void openSurprise(Sprite sprite) {
        System.out.println("/!\\ DANGER /!\\ A GOBLIN is here => Stats: LIFE " + getNumberOfLife() + " - POWER " + getAttackLevel() + " /!\\ DANGER /!\\ \n* START FIGHTING");

        // sprite attaque et réduit le niveau de vie de l'ennemi
        int newEnnemiLifeLevel = this.getNumberOfLife() - sprite.getAttackLevel();
        if (newEnnemiLifeLevel < 1) {
            System.out.println("* !!! YOU WIN !!! => GOBLIN is dead !");
        }
        if (newEnnemiLifeLevel > 0) {
            System.out.println("* GOBLIN Life level is now: " + newEnnemiLifeLevel);
            System.out.println("* Ennemi is attacking you now !");
            int newSpriteLevelLife = sprite.getNumberOfLife() - this.getAttackLevel();
            sprite.setNumberOfLife(newSpriteLevelLife);
            System.out.println("* Your new Life is now: " + sprite.getNumberOfLife() + "\n");
        }
    }
}

