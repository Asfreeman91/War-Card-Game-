package com.promineotech;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Card>hand = new ArrayList<>();
	int score;
	String name;
	
	
	
	List<Card> handList = new ArrayList<Card>();
	Player(List<Card> hand, int score, String name) {
		this.hand = hand;
		this.score = score;
		this.name = name;
		
		
	}
	
	public Player(String string) {
		this.name = string;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void describePlayer() {
		
	}
	
	public Card flip() {
		Card card = this.hand.remove(0);
		return card;
	}
	
	public void draw() {
		
	}
	
	public void incrementScore() {
		this.score ++;
		
	}

}
