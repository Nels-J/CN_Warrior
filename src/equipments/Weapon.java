package equipments;

public abstract class Weapon {
    private String name;
    private String picture;
    private int attackLevel;


    // Constructor
    public Weapon(String name, String picture, int attackLevel) {
        this.name = name;
        this.picture = picture;
        this.attackLevel = attackLevel;
    }


    // Getter & Setter


    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                ", attackLevel=" + attackLevel;
    }
}
