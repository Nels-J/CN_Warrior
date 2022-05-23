package equipments;

import characters.Sprite;
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
