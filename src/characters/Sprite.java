package characters;

public abstract class Sprite {
    // attributes declarations
    private String name;
    private String picture; // TODO +Tard => refactor to store a picture
    private int numberOfLife;
    private int attackLevel;
    //private boolean characterType; // True=Magician||Warrior False=Enemies/

    // constructor
    public Sprite(String name, String picture, int numberOfLife, int attackLevel) {
        this.setName(name);
        this.picture = picture;
        this.numberOfLife = numberOfLife;
        this.attackLevel = attackLevel;
        //this.type = type;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String newPicture) {
        this.picture = newPicture;
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

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                ", numberOfLife=" + numberOfLife +
                ", attackLevel=" + attackLevel;
    }
}