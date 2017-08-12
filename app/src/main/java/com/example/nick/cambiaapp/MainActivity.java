package com.example.nick.cambiaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPlayClick(View view) {
        //Intent i = new Intent(this, PlayerCount.class);
        Intent i = new Intent(this, PlaySettings.class);
        startActivity(i);
    }

}
