package gamestuff;

public class LooseException extends Exception {

    // CONSTRUCTOR(s)
    public LooseException(String playerMessageToOutput) {
        super(playerMessageToOutput);
    }

    // METHOD(s)
    @Override
    public String toString() {
        return "CustomExceptions{" +
                "playerMessageOutput='" + getMessage() + '\'' +
                '}';
    }
}

