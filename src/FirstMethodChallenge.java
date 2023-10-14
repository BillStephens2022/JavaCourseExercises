public class FirstMethodChallenge {
    public static void main(String[] args) {
        String name = "Bill";
        int score = 1500;
        int highScorePosition = calculateHighScorePosition(score);
        displayHighScorePosition(name, highScorePosition);

        name = "Tim";
        score = 1000;
        highScorePosition = calculateHighScorePosition(score);
        displayHighScorePosition(name, highScorePosition);

        name = "John";
        score = 500;
        highScorePosition = calculateHighScorePosition(score);
        displayHighScorePosition(name, highScorePosition);

        name = "Becky";
        score = 100;
        highScorePosition = calculateHighScorePosition(score);
        displayHighScorePosition(name, highScorePosition);

        name = "Jenny";
        score = 25;
        highScorePosition = calculateHighScorePosition(score);
        displayHighScorePosition(name, highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score list.");

    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 0;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        } else {
            position = 4;
        }

        return position;

    }
}
