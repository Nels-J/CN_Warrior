package characters;

public class Warrior extends Character {
    public Warrior() {
        this("default warrior");
    }
    public Warrior(String name) {
        this(name, "war.png", 5, 5);
    }
    public Warrior(String name, String picture, int numberOfLife, int attackLevel) {
        super(name, picture, numberOfLife, attackLevel);
    }
}
