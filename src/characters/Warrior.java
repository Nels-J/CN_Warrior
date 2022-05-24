package characters;

public class Warrior extends Sprite {
    public Warrior() {
        this("default warrior");
    }

    public Warrior(String name) {
        this(name, "war.png", 5, 5, 10,10);
    }

    public Warrior(String name, String picture, int numberOfLife, int attackLevel, int maxLife, int maxAttack) {
        super(name, picture, numberOfLife, attackLevel, 10,10);
    }
}
