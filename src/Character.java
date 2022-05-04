public class Character {
    // attributes declarations
    String characterName;
    String characterPicture; //todo refactor to store a picture
    int characterNumberOfLife;
    int characterAttackLevel;
    boolean characterType; // True=Wizard||Warrior False=Enemies/

    public Character(String characterName, String characterPicture, int characterNumberOfLife, int characterAttackLevel, boolean characterType) {
        this.characterName = characterName;
        this.characterPicture = characterPicture;
        this.characterNumberOfLife = characterNumberOfLife;
        this.characterAttackLevel = characterAttackLevel;
        this.characterType = characterType;
    }
}

