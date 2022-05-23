package gamestuff;

public class WinException extends Exception {

    // CONSTRUCTOR(s)
    public WinException(String playerMessageToOutput) {
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

