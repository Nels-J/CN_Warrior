package equipments;

import characters.Sprite;
import surprise.Surprise;

public class Potion implements Surprise {
    private String name;
    private String picture; // TODO refactor to store a picture
    private int numberOfLife;


    // Constructor

    public Potion() {
        this.name = "default potion";
        this.picture = "picture.png";
        this.numberOfLife = 5;
    }

    public Potion(String name, String picture, int numberOfLife) {
        this.name = name;
        this.picture = picture;
        this.numberOfLife = numberOfLife;
    }


    // Getter & Setter

    @Override
    public void openSurprise(Sprite sprite) {
    }

    @Override
    public String toString() {
        return "Potion{" +
                "name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                ", numberOfLife=" + numberOfLife +
                '}';
    }
}
