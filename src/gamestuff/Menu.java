package gamestuff;

import characters.Magician;
import characters.Warrior;

import java.util.Scanner;

public class Menu { // TODO ajouter démarrer une partie
    public Menu() {
    }

// METHOD(s)
    public void mainMenu(){
        try {
            boolean quitOrNew;
            Scanner clavier = new Scanner(System.in);
            System.out.println(" (0) - Quit / (1) - New Player");
            quitOrNew = clavier.nextInt() == 1; //Pour connaitre les exceptions à Catch voir le chapitre Throws de la méthode nextInt dans la doc
            if (quitOrNew) {
                try {
                    boolean selectedHero;
                    System.out.println(" Select your new hero -> (0) - Magician / (1) - Warrior");
                    selectedHero = clavier.nextInt() == 1;
                    String heroName;
                    System.out.println(" Your hero name please: ");
                    heroName = clavier.next();
                    clavier.close();

                    // TODO +Tard => Afficher toutes les infos du personnage OU modifier ses infos
                    if (!selectedHero) {
                        Magician magician = new Magician(heroName);
                        System.out.println("Magician name is :" + magician.getName());
                    } else {
                        Warrior warrior = new Warrior(heroName);
                        System.out.println("Warrior name is :" + warrior.getName());
                    }

                } catch (Exception errorSelectHeroMenuInput) {
                    System.out.println("Error occur during the hero selection process!");
                } finally {
                    System.out.println("Creation of new player - Process ended!");
                }
            }

        } catch (Exception errorUserMenuInput) {
            System.out.println("Error occur in the main menu!");
        } finally {
            System.out.println("JAVA c'est plus fort que toi !");
        }
    }
    public void startGame(){
        System.out.println("Ready to start?");
    }
}
