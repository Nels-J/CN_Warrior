package gamestuff;

public class CustomExceptions extends Exception {
    // ATTRIBUTE(s)
    String playerMessageToOutput;


    // CONSTRUCTOR(s)
    public CustomExceptions(String playerMessageToOutput) {
        this.playerMessageToOutput = playerMessageToOutput;
    }


    // GETTER(s) & SETTER(s)
    public String getPlayerMessageToOutput() {
        return playerMessageToOutput;
    }

    public void setPlayerMessageToOutput(String playerMessageToOutput) {
        this.playerMessageToOutput = playerMessageToOutput;
    }


    // METHOD(s)
    @Override
    public String toString() {
        return "CustomExceptions{" +
                "playerMessageOutput='" + getPlayerMessageToOutput() + '\'' +
                '}';
    }
}

