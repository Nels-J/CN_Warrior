package equipments;

import characters.Magician;
import characters.Sprite;
import characters.Warrior;
import surprise.Surprise;


public class Spell implements Surprise {
    private String name;
    private String picture; //TODO refactor to store a picture
    private int attackLevel;


    // Constructor
    public Spell() {
        this.name = "default spell";
        this.picture = "picture.png";
        this.attackLevel = 5;
    }

    public Spell(String name, String picture, int attackLevel) {
        this.name = name;
        this.picture = picture;
        this.attackLevel = attackLevel;
    }


    // GETTER & SETTER


    // METHOD(s)
    @Override
    public void openSurprise(Sprite sprite) {
        int newAttackLevel = sprite.getAttackLevel() + 2;

        if ((sprite instanceof Magician) && (newAttackLevel <= 15)) {
            sprite.setAttackLevel(newAttackLevel);
            System.out.println("+++ You've got a SPELL => 2 additional attack level added +++");
        } else {
            sprite.setAttackLevel(sprite.getMaxAttack());
            System.out.println("+++ You've got a SPELL => Strength set to MAX attack level +++");
        }
    }

    @Override
    public String toString() {
        return "Spell{" +
                "name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                ", attackLevel=" + attackLevel +
                '}';
    }
}
