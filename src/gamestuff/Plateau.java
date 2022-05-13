package gamestuff;

/*
 ATTRIBUTS
 -> Cases - Un Plateau sous forme de string pour vérifier le déplacement (refacto +tard en Collection Arraylist)
 -> Un pion

 CONSTRUCTOR
 joueur(pion) & nbdecases(Cases)
 -> avancer le pion arbitrairement
 -> avancer le pion selon le résultat de Dédé
 METHODES
 -> positioner le pion en début de partie
 -> avancer le pion arbitrairement
 -> avancer le pion selon le résultat de Dédé

 */

import java.util.Arrays;

public class Plateau {
    public String[] cases;
    public int nbDeCases;
    public int position;

    public Plateau() {
        nbDeCases = 4;
        cases = new String[]{"case1", "case2", "case3", "case4"};
        position = 0;
    }

    @Override
    public String toString() {
        return "Plateau{" +
                "cases=" + Arrays.toString(cases) +
                ", nbDeCases=" + nbDeCases +
                ", position=" + position +
                '}';
    }


}

