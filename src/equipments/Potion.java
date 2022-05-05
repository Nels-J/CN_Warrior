package equipments;

public class Potion {
    private String name;
    private String picture; // TODO refactor to store a picture
    private int numberOfLife;

    // Constructor
    public Potion(String name, String picture, int numberOfLife) {
        this.name = name;
        this.picture = picture;
        this.numberOfLife = numberOfLife;
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

    public int getNumberOfLife() {
        return numberOfLife;
    }

    public void setNumberOfLife(int newNumberOfLife) {
        this.numberOfLife = newNumberOfLife;
    }
}
