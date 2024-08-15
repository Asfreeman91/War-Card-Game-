package com.promineotech;

public class Card {
	
	int value;
	String suits;
	String name;
	
	Card(String name, String suits, int value) {
		this.value = value;
		this.suits = suits;
		this.name = name;
		
	}
	
	
	
	public Card() {
		// TODO Auto-generated constructor stub
	}



	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}



	public String getSuits() {
		return suits;
	}



	public void setSuits(String suits) {
		this.suits = suits;
	}



	public void describe() {
		System.out.println(this.name + " of " + this.suits + " - " + value);
	}

	

}
