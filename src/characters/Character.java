package characters;

public class Character {  // ASK make it abstract could be a good idea i guess
    // attributes declarations
    private String name;
    private String picture; //TODO refactor to store a picture
    private int numberOfLife;
    private int attackLevel;
    //private boolean characterType; // True=Magician||Warrior False=Enemies/

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

    // constructors
    public Character(String name, String picture, int numberOfLife, int attackLevel) {
        this.setName(name);
        this.picture = picture;
        this.numberOfLife = numberOfLife;
        this.attackLevel = attackLevel;
        //this.type = type;
    }

    // toString()
    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                ", numberOfLife=" + numberOfLife +
                ", attackLevel=" + attackLevel;
    }
}

