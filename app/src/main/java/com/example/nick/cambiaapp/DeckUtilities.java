package com.example.nick.cambiaapp;

//Methods for creating the deck based off of methods from this website:
//http://introcs.cs.princeton.edu/java/14array/Deck.java.html
public class DeckUtilities {
    private final String[] SUITS = {"Clubs", "Diamonds", "Spades", "Hearts"};
    private final String[] RANKS = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Joker"};
    String[] deck = new String[56];
    private int numberOfCards = 0;

    public void createStrings() {
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                if (numberOfCards < 54) {
                    numberOfCards++;
                    deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
                }
            }
        }
    }

    public String[] getStrings() {
        return deck;
    }

    public Card[] shuffleDeck(Card[] c) {
        for (int i = 0; i < 54; i++) {
            int r = i + (int) (Math.random() * (54 - i));
            Card temp = c[r];
            c[r] = c[i];
            c[i] = temp;
        }
        return c;
    }


    //Original shuffleDeck method
    /*private void shuffleDeck(){
        for (int i = 0; i < numberOfCards; i++) {
            int r = i + (int) (Math.random() * (numberOfCards-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
    }*/


}
