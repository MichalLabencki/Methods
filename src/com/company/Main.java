package com.company;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

        int highScorePosition = calculateHighscorePostion(1500);
        displayHighScorePosition("Tim", highScorePosition);
        highScorePosition = calculateHighscorePostion(900);
        displayHighScorePosition("Bob", highScorePosition);
        highScorePosition = calculateHighscorePostion(400);
        displayHighScorePosition("Percy", highScorePosition);
        highScorePosition = calculateHighscorePostion(50);
        displayHighScorePosition("Gilbert", highScorePosition);


    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + "managed to players position "
                + highScorePosition + "on the high score table");

    }

    public static int calculateHighscorePostion(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
          { return 3;
        { else {
          return 4;
                }
             }
                public static int calculateScore ( boolean gameOver, int score, int LevelCompleted, int bonus){


                if (gameOver) {
                    int finalScore = score + (LevelCompleted * bonus);
                    finalScore += 2000;
                    return finalScore;


                }

            }
            }


        }
    }
}