package characters;

import surprise.Surprise;

public class Goblin extends Sprite implements Surprise {

    public Goblin() {
        super("default Goblin", "gob.png", 6, 1);
    }
    public Goblin(String name) {
        super(name, "gob.png", 6, 1);
    }

    @Override
    public void openSurprise(Sprite sprite) {

    }

}
