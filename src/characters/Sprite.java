package characters;

public abstract class Sprite {

    // ATTRIBUTE(s)
    private String name;
    private String picture; // TODO +Tard => refactor to store a picture
    private int numberOfLife;
    private int attackLevel;
    private int maxLife;
    private int maxAttack;


    // CONSTRUCTOR(s)
    public Sprite(String name, String picture, int numberOfLife, int attackLevel, int maxLife, int maxAttack) {
        this.setName(name);
        this.picture = picture;
        this.numberOfLife = numberOfLife;
        this.attackLevel = attackLevel;
        this.maxLife = maxLife;
        this.maxAttack = maxAttack;
    }

    // GETTER(s) & SETTER(s)
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getNumberOfLife() {
        return numberOfLife;
    }

    public void setNumberOfLife(int newNumberOfLife) {
        this.numberOfLife = newNumberOfLife;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int newAttackLevel) {
        this.attackLevel = newAttackLevel;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public int getMaxAttack() {
        return maxAttack;
    }

    @Override
    public String toString() {
        return "Sprite{" +
                "name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                ", numberOfLife=" + numberOfLife +
                ", attackLevel=" + attackLevel +
                ", maxLife=" + maxLife +
                ", maxAttack=" + maxAttack +
                '}';
    }
}