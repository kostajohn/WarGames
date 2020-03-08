package game;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Deck {
	private List<card> cards;
	private String[] suites = {"Hearts", "Clubs", "Diamonds", "Spades"};
	private String[] valueWords = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};


public Deck() {
	cards = new ArrayList<card>();
	
	for (String suit : suites) {
		for (int i = 0; i < valueWords.length; i++) {
			cards.add(new card(i, valueWords[i] + " of " + suit));
		}
	}
}

public void describe() {
	for (card card : cards) {
		card.describe();	
	}
}

public void shuffle() {
	Collections.shuffle(cards);
}

public card draw() {
	return cards.remove(0);
}
}