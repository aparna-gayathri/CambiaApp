package com.example.nick.cambiaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class PlaySettings extends AppCompatActivity implements OnItemSelectedListener {

    EditText playerOneInput;
    EditText playerTwoInput;
    EditText playerThreeInput;
    EditText playerFourInput;
    EditText playerFiveInput;
    EditText playerSixInput;
    int playerCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_settings);

        Spinner playCounter = (Spinner) findViewById(R.id.playerCountSpinner);
        playCounter.setOnItemSelectedListener(this);

        playerOneInput = (EditText) findViewById(R.id.playerOneEditText);
        playerTwoInput = (EditText) findViewById(R.id.playerTwoEditText);
        playerThreeInput = (EditText) findViewById(R.id.playerThreeEditText);
        playerFourInput = (EditText) findViewById(R.id.playerFourEditText);
        playerFiveInput = (EditText) findViewById(R.id.playerFiveEditText);
        playerSixInput = (EditText) findViewById(R.id.playerFiveEditText);
        playerCount = 2;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getSelectedItem().toString().equals("2")) {
            findViewById(R.id.playerThreeEditText).setVisibility(View.INVISIBLE);
            findViewById(R.id.playerFourEditText).setVisibility(View.INVISIBLE);
            findViewById(R.id.playerFiveEditText).setVisibility(View.INVISIBLE);
            findViewById(R.id.playerSixEditText).setVisibility(View.INVISIBLE);
            findViewById(R.id.playerThreeTextView).setVisibility(View.INVISIBLE);
            findViewById(R.id.playerFourTextView).setVisibility(View.INVISIBLE);
            findViewById(R.id.playerFiveTextView).setVisibility(View.INVISIBLE);
            findViewById(R.id.playerSixTextView).setVisibility(View.INVISIBLE);
            playerCount = 2;
        } else if (parent.getSelectedItem().toString().equals("3")) {
            findViewById(R.id.playerThreeEditText).setVisibility(View.VISIBLE);
            findViewById(R.id.playerFourEditText).setVisibility(View.INVISIBLE);
            findViewById(R.id.playerFiveEditText).setVisibility(View.INVISIBLE);
            findViewById(R.id.playerSixEditText).setVisibility(View.INVISIBLE);
            findViewById(R.id.playerThreeTextView).setVisibility(View.VISIBLE);
            findViewById(R.id.playerFourTextView).setVisibility(View.INVISIBLE);
            findViewById(R.id.playerFiveTextView).setVisibility(View.INVISIBLE);
            findViewById(R.id.playerSixTextView).setVisibility(View.INVISIBLE);
            playerCount = 3;
        } else if (parent.getSelectedItem().toString().equals("4")) {
            findViewById(R.id.playerThreeEditText).setVisibility(View.VISIBLE);
            findViewById(R.id.playerFourEditText).setVisibility(View.VISIBLE);
            findViewById(R.id.playerFiveEditText).setVisibility(View.INVISIBLE);
            findViewById(R.id.playerSixEditText).setVisibility(View.INVISIBLE);
            findViewById(R.id.playerThreeTextView).setVisibility(View.VISIBLE);
            findViewById(R.id.playerFourTextView).setVisibility(View.VISIBLE);
            findViewById(R.id.playerFiveTextView).setVisibility(View.INVISIBLE);
            findViewById(R.id.playerSixTextView).setVisibility(View.INVISIBLE);
            playerCount = 4;
        } else if (parent.getSelectedItem().toString().equals("5")) {
            findViewById(R.id.playerThreeEditText).setVisibility(View.VISIBLE);
            findViewById(R.id.playerFourEditText).setVisibility(View.VISIBLE);
            findViewById(R.id.playerFiveEditText).setVisibility(View.VISIBLE);
            findViewById(R.id.playerSixEditText).setVisibility(View.INVISIBLE);
            findViewById(R.id.playerThreeTextView).setVisibility(View.VISIBLE);
            findViewById(R.id.playerFourTextView).setVisibility(View.VISIBLE);
            findViewById(R.id.playerFiveTextView).setVisibility(View.VISIBLE);
            findViewById(R.id.playerSixTextView).setVisibility(View.INVISIBLE);
            playerCount = 5;
        } else {
            findViewById(R.id.playerThreeEditText).setVisibility(View.VISIBLE);
            findViewById(R.id.playerFourEditText).setVisibility(View.VISIBLE);
            findViewById(R.id.playerFiveEditText).setVisibility(View.VISIBLE);
            findViewById(R.id.playerSixEditText).setVisibility(View.VISIBLE);
            findViewById(R.id.playerThreeTextView).setVisibility(View.VISIBLE);
            findViewById(R.id.playerFourTextView).setVisibility(View.VISIBLE);
            findViewById(R.id.playerFiveTextView).setVisibility(View.VISIBLE);
            findViewById(R.id.playerSixTextView).setVisibility(View.VISIBLE);
            playerCount = 6;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        findViewById(R.id.playerThreeEditText).setVisibility(View.VISIBLE);
        findViewById(R.id.playerFourEditText).setVisibility(View.VISIBLE);
        findViewById(R.id.playerFiveEditText).setVisibility(View.VISIBLE);
        findViewById(R.id.playerSixEditText).setVisibility(View.VISIBLE);
        findViewById(R.id.playerThreeTextView).setVisibility(View.VISIBLE);
        findViewById(R.id.playerFourTextView).setVisibility(View.VISIBLE);
        findViewById(R.id.playerFiveTextView).setVisibility(View.VISIBLE);
        findViewById(R.id.playerSixTextView).setVisibility(View.VISIBLE);
    }

    //Passes through player names depending on number of players
    public void onStartButtonClick(View view) {
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
