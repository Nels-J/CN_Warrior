package equipments;

public class Spell {
    private String name;
    private String picture; //TODO refactor to store a picture
    private int attackLevel;

    // Constructor
    public Spell(String name, String picture, int attackLevel) {
        this.name = name;
        this.picture = picture;
        this.attackLevel = attackLevel;
    }

    // Getter & Setter
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

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int newAttackLevel) {
        this.attackLevel = newAttackLevel;
    }
}
