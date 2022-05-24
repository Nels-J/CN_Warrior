package characters;

import surprise.Surprise;

/**
 * @author nelsj
 */
public class Dragon extends Sprite implements Surprise {
    public Dragon() {
        super("default Dragon", "drag.png", 15, 4, 0, 0);
    }

    public Dragon(String name) {
        super(name, "drag.png", 15, 4, 0, 0);
    }

    @Override
    public void openSurprise(Sprite sprite) {
        System.out.println("/!\\ DANGER /!\\ A DRAGON is here => Stats: LIFE " + getNumberOfLife() + " - POWER " + getAttackLevel() + " /!\\ DANGER /!\\ \n*START FIGHTING");
        // sprite attaque et réduit le niveau de vie de l'ennemi
        int newEnnemiLifeLevel = this.getNumberOfLife() - sprite.getAttackLevel();
        if (newEnnemiLifeLevel < 1) {
            System.out.println("!!! YOU WIN !!! => DRAGON is dead !");
        }
        if (newEnnemiLifeLevel > 0) {
            System.out.println("* WIZARD Life level is now: " + newEnnemiLifeLevel);
            System.out.println("* Ennemi is attacking you now !");
            int newSpriteLevelLife = sprite.getNumberOfLife() - this.getAttackLevel();
            sprite.setNumberOfLife(newSpriteLevelLife);
            System.out.println("* Your new Life is now: " + sprite.getNumberOfLife() + "\n");
        }
    }
}
