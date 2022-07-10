public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        displayHighScorePosition("Sairam", 2);
        displayHighScorePosition("test", 1);
        displayHighScorePosition("text", 3);
        displayHighScorePosition("topper", 4);
        int rank = calculateHighScorePosition(1500);
        System.out.println(rank);
        rank = calculateHighScorePosition(900);
        System.out.println(rank);
        rank = calculateHighScorePosition(400);
        System.out.println(rank);
        rank = calculateHighScorePosition(50);
        System.out.println(rank);
    }
    public static void displayHighScorePosition(String playersName, int highScorePosition) {
        System.out.println(playersName + " managed to get into position " + highScorePosition +
                " on the high score table");
    }
    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore>=1000) {
            return 1;
        }
        else if (playerScore>=500) {
            return 2;
        }
        else if (playerScore>=100) {
            return 3;
        }
        return 4;
    }
}