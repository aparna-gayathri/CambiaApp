package com.example.nick.cambiaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PlayerCount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_count);
    }

    //Passes the number typed in to next screen
    public void onStartMenuClick(View view) {
        Intent i = new Intent(this, PlayerName.class);

        //Sends playerCount to PlayerNameActivity
        final EditText playerCount = (EditText) findViewById(R.id.startMenuInput);
        try {
            int playerNumber = Integer.parseInt(playerCount.getText().toString());
            if (playerNumber <= 1 || playerNumber > 6) {
                Toast.makeText(this, "Number of players has to be between 2 and 6", Toast.LENGTH_SHORT).show();
            } else {
                i.putExtra("playerCount", playerNumber);
                startActivity(i);
            }
        } catch (Exception e) {
            Toast.makeText(this, "Number of players has to be between 2 and 6", Toast.LENGTH_SHORT).show();
        }
    }

}