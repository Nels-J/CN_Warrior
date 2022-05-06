package gamestuff;

import java.util.Scanner;

public class Menu {
    public Menu() {
        //TODO 1st Menu ask Do you want a new character ? or Do you want to Quit the game
        try {
            boolean quitOrNew;
            Scanner clavier = new Scanner(System.in);
            System.out.println(" (0) - Quit / (1) - New Player");
            quitOrNew = clavier.nextInt() == 1; //Pour connaitre les exceptions a Catch voir le chapitre Throws de la methode nextInt dans la doc
            clavier.close();

            /*TODO IF New Player
            * INSTANCIATION nouveau personnage: Guerrier/Magicien
            * PUIS demande la saisie des informations adequates à la création // nom du personnage
            * En cours de création CHOIX Afficher toutes les infos du personnage / modifier les infos
            */

        } catch (Exception errorUserMenuInput) { //Exception generique - errorUserMenuInput est le nom que je lui donne ds ce contexte.
            System.out.println("Erreur de saisie utilisateur dans le menu principal");
        } finally {
            System.out.println("JAVA c'est plus fort que toi !");
        }
    }
}
