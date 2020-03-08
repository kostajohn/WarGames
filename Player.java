package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Player {

	private String name;
	private int score;
	private List<card> hand = new ArrayList<card>();
	
	public Player(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println(name + " Score " + score);
		for (card card : hand) {
			card.describe();
		}
	}
	
	public card flip() {
		return hand.remove(0);
	}
	
	public void draw (Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}
}
