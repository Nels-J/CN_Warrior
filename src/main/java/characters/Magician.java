package characters;

public class Magician extends Sprite {

    public Magician() {
        this("default wizard");
    }

    public Magician(String name) {
        this(name, "mag.png", 3, 8,5,15);
    }

    public Magician(String name, String picture, int numberOfLife, int attackLevel, int maxLife, int maxAttack) {
        super(name, picture, numberOfLife, attackLevel, maxLife, maxAttack);
    }

}
