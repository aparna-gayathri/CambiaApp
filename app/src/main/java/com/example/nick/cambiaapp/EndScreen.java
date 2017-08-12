package com.example.nick.cambiaapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class EndScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_screen);

        Bundle playScreenData = getIntent().getExtras();

        int playerCount = playScreenData.getInt("playerCount");
        String playerOneName = playScreenData.getString("playerOneName");
        int playerOneScore = playScreenData.getInt("playerOneScore");
        String playerTwoName = playScreenData.getString("playerTwoName");
        int playerTwoScore = playScreenData.getInt("playerTwoScore");

        String playerThreeName = "";
        String playerFourName = "";
        String playerFiveName = "";
        String playerSixName = "";
        int playerThreeScore = 0;
        int playerFourScore = 0;
        int playerFiveScore = 0;
        int playerSixScore = 0;

        if (playerCount >= 3) {
            playerThreeName = playScreenData.getString("playerThreeName");
            playerThreeScore = playScreenData.getInt("playerThreeScore");
        }
        if (playerCount >= 4) {
            playerFourName = playScreenData.getString("playerFourName");
            playerFourScore = playScreenData.getInt("playerFourScore");
        }
        if (playerCount >= 5) {
            playerFiveName = playScreenData.getString("playerFiveName");
            playerFiveScore = playScreenData.getInt("playerFiveScore");
        }
        if (playerCount == 6) {
            playerSixName = playScreenData.getString("playerSixName");
            playerSixScore = playScreenData.getInt("playerSixScore");
        }

        int[] scores = {playerOneScore, playerTwoScore, playerThreeScore, playerFourScore, playerFiveScore, playerSixScore};
        for (int counter = 0; counter < 6; counter++) {
            int cur = counter;
            int score = scores[counter];
            //Sort list
        }
    }
}
