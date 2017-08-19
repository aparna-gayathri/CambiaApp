package com.example.nick.cambiaapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.util.Arrays;

public class EndScreen extends AppCompatActivity {

    int playerOneScore, playerTwoScore, playerThreeScore, playerFourScore, playerFiveScore, playerSixScore, playerCount, cambiaCaller;
    String playerOneName = "";
    String playerTwoName = "";
    String playerThreeName = "";
    String playerFourName = "";
    String playerFiveName = "";
    String playerSixName = "";
    String finalDisplay = "";
    boolean playerOneNameUsed, playerTwoNameUsed, playerThreeNameUsed, playerFourNameUsed, playerFiveNameUsed, playerSixNameUsed = false;
    boolean victor = false;
    int[] scores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_screen);

        TextView finalDisplayTextView = (TextView) findViewById(R.id.finalDisplay);

        final String TAG = "ngeorgian.cambiaapp";

        Bundle playScreenData = getIntent().getExtras();

        playerCount = playScreenData.getInt("playerCount");
        cambiaCaller = playScreenData.getInt("cambiaCaller");
        playerOneName = playScreenData.getString("playerOneName");
        playerOneScore = playScreenData.getInt("playerOneScore");
        playerTwoName = playScreenData.getString("playerTwoName");
        playerTwoScore = playScreenData.getInt("playerTwoScore");

        scores = new int[playerCount];
        scores[0] = playerOneScore;
        scores[1] = playerTwoScore;

        if (playerCount >= 3) {
            playerThreeName = playScreenData.getString("playerThreeName");
            playerThreeScore = playScreenData.getInt("playerThreeScore");
            scores[2] = playerThreeScore;
        }
        if (playerCount >= 4) {
            playerFourName = playScreenData.getString("playerFourName");
            playerFourScore = playScreenData.getInt("playerFourScore");
            scores[3] = playerFourScore;
        }
        if (playerCount >= 5) {
            playerFiveName = playScreenData.getString("playerFiveName");
            playerFiveScore = playScreenData.getInt("playerFiveScore");
            scores[4] = playerFiveScore;
        }
        if (playerCount == 6) {
            playerSixName = playScreenData.getString("playerSixName");
            playerSixScore = playScreenData.getInt("playerSixScore");
            scores[5] = playerSixScore;
        }

        Arrays.sort(scores);
        for (int temp : scores) Log.i("TAG", temp + "\n");

        for (int counter = 0; counter < playerCount; counter++) {
            if (victor == false && scores[0] < 5) {
                finalDisplay += "VICTOR: ";
                victor = true;
            }
            finalDisplay += getName(scores[counter]) + ": " + scores[counter] + "\n";
        }

        finalDisplayTextView.setText(finalDisplay);
    }

    private String getName(int playerScore) {
        if (playerScore == playerOneScore && playerOneNameUsed == false) {
            playerOneNameUsed = true;
            return playerOneName;
        }
        if (playerScore == playerTwoScore && playerTwoNameUsed == false) {
            playerTwoNameUsed = true;
            return playerTwoName;
        }
        if (playerScore == playerThreeScore && playerThreeNameUsed == false) {
            playerThreeNameUsed = true;
            return playerThreeName;
        }
        if (playerScore == playerFourScore && playerFourNameUsed == false) {
            playerFourNameUsed = true;
            return playerFourName;
        }
        if (playerScore == playerFiveScore && playerFiveNameUsed == false) {
            playerFiveNameUsed = true;
            return playerFiveName;
        }
        playerSixNameUsed = true;
        return playerSixName;
    }
}
