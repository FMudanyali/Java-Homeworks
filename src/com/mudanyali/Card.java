package com.mudanyali;

public class Card {
	private final String face; //face of card
	private final String suit; //suit of card

	// two-argument constructor to initialize face and suit
	public Card(String cardFace, String cardSuit){
		this.face = cardFace;
		this.suit = cardSuit;
	}

	// return String representation of Card
	public String toString(){
		return face + " of " + suit;
	}
}
