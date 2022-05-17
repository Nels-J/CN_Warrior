package gamestuff;

import characters.Sprite;
import characters.Magician;
import characters.Warrior;

import java.util.Scanner;

public class Menu {

    // ATTRIBUTE(s)
    private boolean quitOrNew;
    private Scanner clavier;
    private boolean selectedHero;
    private String heroName;
    private Sprite sprite;
    private boolean quitOrStart;


    // CONSTRUCTOR(s)

    public Menu() {
        this.clavier = new Scanner(System.in);
    }


    // GETTER(s)/SETTER(s)

    public boolean isQuitOrNew() {
        return quitOrNew;
    }

    public void setQuitOrNew(boolean quitOrNew) {
        this.quitOrNew = quitOrNew;
    }

    public Scanner getClavier() {
        return clavier;
    }

    public void setClavier(Scanner clavier) {
        this.clavier = clavier;
    }

    public boolean isSelectedHero() {
        return selectedHero;
    }

    public void setSelectedHero(boolean selectedHero) {
        this.selectedHero = selectedHero;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    public boolean isQuitOrStart() {
        return quitOrStart;
    }

    public void setQuitOrStart(boolean quitOrStart) {
        this.quitOrStart = quitOrStart;
    }


    // METHOD(s)

    public Sprite mainMenu() {
        try {
            System.out.println(" (0) - Quit / (1) - New Player");
            quitOrNew = clavier.nextInt() == 1;
            if (quitOrNew) {
                try {
                    System.out.println(" Select your new hero -> (0) - Magician / (1) - Warrior");
                    selectedHero = clavier.nextInt() == 1;
                    System.out.println(" Your hero name please: ");
                    heroName = clavier.next();
                    clavier.close();
                    // TODO +Tard => Afficher toutes les infos du personnage OU modifier ses infos
                    if (!selectedHero) {
                        sprite = new Magician(heroName);
                        System.out.println("Magician name is : " + sprite.getName());
                    } else {
                        sprite = new Warrior(heroName);
                        System.out.println("Warrior name is : " + sprite.getName());
                    }
                } catch (Exception errorSelectHeroMenuInput) {
                    System.out.println("Error occur during the hero selection process, try again!");
                    // TODO +tard => relancer peut être game.init ?
                } finally {
                    System.out.println("Creation of new character - Process ended!");
                }
            }
        } catch (Exception errorUserMenuInput) {
            System.out.println("Error occur in the main menu!");
        } finally {
            System.out.println("Creation of new player - Process ended!");
            clavier.close();
        }
        return sprite;
    }
}

//    public void startMenu() {
//            clavier = new Scanner(System.in);
//            System.out.println("Ready to start? (0) - No / (1) - Yes");
//            quitOrStart = clavier.nextInt() == 1;
//            if(quitOrStart) {
//                            }
//            clavier.close();
//
//}
