//package gamestuff;
//
//import java.util.ArrayList;
//
//public class GameBoard {
//
//    private ArrayList<String> box;
//    private int playerPosition;
//
//    public GameBoard() {
//        this(new ArrayList<String>());
//
//    }
//    public GameBoard(ArrayList<String> box) {
//        this.box = box;
//        this.playerPosition = 0;
//    }
//
//    public GameBoard(int playerPosition, ArrayList<String> box) {
//        this.playerPosition = playerPosition;
//        this.box = box;
//    }
//
//    public int getPlayerPosition() {
//        return playerPosition;
//    }
//
//    public void setPlayerPosition(int playerPosition) {
//        this.playerPosition = playerPosition;
//    }
//
//    public ArrayList<String> getBox() {
//        return box;
//    }
//
//    public void setBox(ArrayList<String> box) {
//        this.box = box;
//    }
//
//    @Override
//    public String toString() {
//        return "GameBoard{" +
//                "playerPosition=" + playerPosition +
//                ", box=" + box +
//                '}';
//    }
//}