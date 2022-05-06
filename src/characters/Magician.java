package characters;

public class Magician extends Character {

    public Magician() {
        this("default wizard");
    }

    public Magician(String name) {
        this(name, "mag.png", 3, 8);
    }

    public Magician(String name, String picture, int numberOfLife, int attackLevel) {
        super(name, picture, numberOfLife, attackLevel);
    }
}
