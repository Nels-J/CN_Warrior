package equipments;

import characters.Magician;
import characters.Sprite;
import characters.Warrior;
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
        int newLife = sprite.getNumberOfLife() + 2;
        if ((sprite instanceof Magician) && (newLife <= 6)){
                sprite.setNumberOfLife(newLife);
        } else{
            sprite.setNumberOfLife(6);
        }
        if ((sprite instanceof Warrior) && (newLife <= 10)){
            sprite.setNumberOfLife(newLife);
        } else{
            sprite.setNumberOfLife(10);
        }
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
