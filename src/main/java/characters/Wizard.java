package characters;

import surprise.Surprise;

public class Wizard extends Sprite implements Surprise {

    public Wizard() {
        super("default Wizard", "wiz.png", 9, 2, 6, 15);
    }

    public Wizard(String name) {
        super(name, "wiz.png", 9, 2, 6, 15); // super = Appel du constructeur parent
    }

    @Override
    public void openSurprise(Sprite sprite) {
        System.out.println("/!\\ DANGER /!\\ A WIZARD is here => Stats: LIFE " + getNumberOfLife() + " - POWER " + getAttackLevel() + " /!\\ DANGER /!\\");
        // sprite attaque et réduit le niveau de vie de l'ennemi
        int newEnnemiLifeLevel = this.getNumberOfLife() - sprite.getAttackLevel();
        if (newEnnemiLifeLevel < 1) {
            System.out.println("!!! YOU WIN !!! => WIZARD is dead !");
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