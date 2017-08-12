package com.example.nick.cambiaapp;

import android.graphics.drawable.Drawable;

public class Card {
    Drawable cardImage;
    Drawable cardBack;
    boolean availability = true;
    boolean revealed = false;
    String string;

    public Card(String s, Drawable d) {
        string = s;
        cardBack = d;
    }

    public String getString() {
        return string;
    }

    public void setString(String s) {
        string = s;
    }

    public Drawable getImage() {
        if (getRevealed() == true)
            return cardImage;
        else
            return cardBack;
    }

    public void setImage(Drawable image) {
        cardImage = image;
    }

    public boolean getRevealed() {
        return revealed;
    }

    public void setRevealed(boolean r) {
        revealed = r;
    }
}
