package characters;

import surprise.Surprise;

public class Wizard extends Sprite implements Surprise {

    public Wizard(){
        super("default Wizard","wiz.png", 9, 2);
    }

    public Wizard(String name) {
        super(name, "wiz.png", 9, 2); // super = Appel du constructeur parent
    }

    @Override
    public void openSurprise(Sprite sprite) {
    }

}
