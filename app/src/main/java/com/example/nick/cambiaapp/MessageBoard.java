package com.example.nick.cambiaapp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;


public class MessageBoard extends AppCompatActivity {

    //FOR TESTING PURPOSES
    private static final String TAG = "ngeorgian.cambia";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_board);

        Bundle message = getIntent().getExtras();
        String messageOne = message.getString("messageOne");
        String messageTwo = message.getString("messageTwo");
        String messageThree = message.getString("messageThree");
        String messageFour = message.getString("messageFour");
        String messageFive = message.getString("messageFive");

        SpannableString messageOneSS;
        SpannableString messageTwoSS;
        SpannableString messageThreeSS;
        SpannableString messageFourSS;
        SpannableString messageFiveSS;

        if (!messageOne.equals("")) {
            messageOneSS = StringSplitter(messageOne);
            TextView messageOneDisplay = (TextView) findViewById(R.id.messageOne);
            messageOneDisplay.setText(messageOneSS);
        }
        if (!messageTwo.equals("")) {
            messageTwoSS = StringSplitter(messageTwo);
            TextView messageTwoDisplay = (TextView) findViewById(R.id.messageTwo);
            messageTwoDisplay.setText(messageTwoSS);
        }
        if (!messageThree.equals("")) {
            messageThreeSS = StringSplitter(messageThree);
            TextView messageThreeDisplay = (TextView) findViewById(R.id.messageThree);
            messageThreeDisplay.setText(messageThreeSS);
        }
        if (!messageFour.equals("")) {
            messageFourSS = StringSplitter(messageFour);
            TextView messageFourDisplay = (TextView) findViewById(R.id.messageFour);
            messageFourDisplay.setText(messageFourSS);
        }
        if (!messageFive.equals("")) {
            messageFiveSS = StringSplitter(messageFive);
            TextView messageFiveDisplay = (TextView) findViewById(R.id.messageFive);
            messageFiveDisplay.setText(messageFiveSS);
        }
    }

    private SpannableString StringSplitter(String message) {
        //Splits the player name from the rest of the String
        int counter = 0;
        String part1 = "";
        String part2 = "";
        while (message.charAt(counter) != ':') {
            part1 += message.charAt(counter);
            counter++;
        }
        counter++;
        while (counter < message.length()) {
            part2 += message.charAt(counter);
            counter++;
        }

        SpannableString messageSS = new SpannableString(part1 + part2);
        messageSS.setSpan(new StyleSpan(Typeface.BOLD), 0, part1.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return messageSS;
    }


    public void onBackButtonClick(View view) {
        finish();
    }
}
