package characters;

import surprise.Surprise;

/**
 * @author nelsj
 *
 */
public class Dragon extends Sprite implements Surprise {
    public Dragon() {
        super("default Dragon", "drag.png", 15, 4);
    }

    public Dragon(String name) {
        super(name, "drag.png", 15, 4);
    }

    @Override
    public void openSurprise(Sprite sprite) {

    }

}
