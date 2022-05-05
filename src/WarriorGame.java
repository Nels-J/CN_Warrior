import characters.*;
import equipments.*;


public class WarriorGame {
    public static void main(String[] args) {
        System.out.println("Ceci est ma classe principale !");

        Warrior warrior = new Warrior();
        System.out.println(warrior.toString()); //toString n'est pas utile il devient implicite

        Wizard wizard = new Wizard("Jedusor");
        System.out.println(wizard);

        Sword sword = new Sword();
        System.out.println(sword);

    }
}