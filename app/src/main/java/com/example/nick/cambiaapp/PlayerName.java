package com.example.nick.cambiaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PlayerName extends AppCompatActivity {

    EditText playerOneInput;
    EditText playerTwoInput;
    EditText playerThreeInput;
    TextView playerThreeText;
    EditText playerFourInput;
    TextView playerFourText;
    EditText playerFiveInput;
    TextView playerFiveText;
    EditText playerSixInput;
    TextView playerSixText;
    int playerCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_name);

        Bundle playerCountData = getIntent().getExtras();
        playerCount = playerCountData.getInt("playerCount");
        playerOneInput = (EditText) findViewById(R.id.playerOneInput);
        playerTwoInput = (EditText) findViewById(R.id.playerTwoInput);
        playerThreeInput = (EditText) findViewById(R.id.playerThreeInput);
        playerThreeText = (TextView) findViewById(R.id.playerThreeText);
        playerFourInput = (EditText) findViewById(R.id.playerFourInput);
        playerFourText = (TextView) findViewById(R.id.playerFourText);
        playerFiveInput = (EditText) findViewById(R.id.playerFiveInput);
        playerFiveText = (TextView) findViewById(R.id.playerFiveText);
        playerSixInput = (EditText) findViewById(R.id.playerSixInput);
        playerSixText = (TextView) findViewById(R.id.playerSixText);

        //Hides input and text depending on number of players playing (as indicated by previous screen
        if (playerCount < 3) {
            playerThreeInput.setVisibility(View.INVISIBLE);
            playerThreeText.setVisibility(View.INVISIBLE);
        }

        if (playerCount < 4) {
            playerFourInput.setVisibility(View.INVISIBLE);
            playerFourText.setVisibility(View.INVISIBLE);
        }

        if (playerCount < 5) {
            playerFiveInput.setVisibility(View.INVISIBLE);
            playerFiveText.setVisibility(View.INVISIBLE);
        }

        if (playerCount < 6) {
            playerSixInput.setVisibility(View.INVISIBLE);
            playerSixText.setVisibility(View.INVISIBLE);
        }
    }

    //Passes through player names depending on number of players
    public void onPlayerNameClick(View view) {
        Intent toPlayScreen = new Intent(this, PlayScreen.class);

        Bundle extras = new Bundle();
        extras.putInt("playerCount", playerCount);

        if (playerCount == 2) {
            try {
                extras.putString("playerOneName", playerOneInput.getText().toString());
                extras.putString("playerTwoName", playerTwoInput.getText().toString());
                toPlayScreen.putExtras(extras);
                startActivity(toPlayScreen);
            } catch (Exception e) {
                Toast.makeText(this, "All players must have a name", Toast.LENGTH_SHORT).show();
            }
        }
        if (playerCount == 3) {
            try {
                extras.putString("playerOneName", playerOneInput.getText().toString());
                extras.putString("playerTwoName", playerTwoInput.getText().toString());
                extras.putString("playerThreeName", playerThreeInput.getText().toString());
                toPlayScreen.putExtras(extras);
                startActivity(toPlayScreen);
            } catch (Exception e) {
                Toast.makeText(this, "All players must have a name", Toast.LENGTH_SHORT).show();
            }
        }
        if (playerCount == 4) {
            try {
                extras.putString("playerOneName", playerOneInput.getText().toString());
                extras.putString("playerTwoName", playerTwoInput.getText().toString());
                extras.putString("playerThreeName", playerThreeInput.getText().toString());
                extras.putString("playerFourName", playerFourInput.getText().toString());
                toPlayScreen.putExtras(extras);
                startActivity(toPlayScreen);
            } catch (Exception e) {
                Toast.makeText(this, "All players must have a name", Toast.LENGTH_SHORT).show();
            }
        }
        if (playerCount == 5) {
            try {
                extras.putString("playerOneName", playerOneInput.getText().toString());
                extras.putString("playerTwoName", playerTwoInput.getText().toString());
                extras.putString("playerThreeName", playerThreeInput.getText().toString());
                extras.putString("playerFourName", playerFourInput.getText().toString());
                extras.putString("playerFiveName", playerFiveInput.getText().toString());
                toPlayScreen.putExtras(extras);
                startActivity(toPlayScreen);
            } catch (Exception e) {
                Toast.makeText(this, "All players must have a name", Toast.LENGTH_SHORT).show();
            }
        }
        if (playerCount == 6) {
            try {
                extras.putString("playerOneName", playerOneInput.getText().toString());
                extras.putString("playerTwoName", playerTwoInput.getText().toString());
                extras.putString("playerThreeName", playerThreeInput.getText().toString());
                extras.putString("playerFourName", playerFourInput.getText().toString());
                extras.putString("playerFiveName", playerFiveInput.getText().toString());
                extras.putString("playerSixName", playerSixInput.getText().toString());
                toPlayScreen.putExtras(extras);
                startActivity(toPlayScreen);
            } catch (Exception e) {
                Toast.makeText(this, "All players must have a name", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
