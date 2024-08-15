package com.promineotech;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Card card = new Card();
		Deck deck = new Deck();
		Player player1 = new Player("1");
		Player player2 = new Player("2");
		deck.shuffle();
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.getHand().add(deck.draw());
			} else {
				player2.getHand().add(deck.draw());
			}
			}
		for (int i = 0; i < 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			System.out.print("Player 1 hand: ");
			player1Card.describe();
			System.out.println("------------------------------------");
			System.out.print("Player 2 hand: ");
			player2Card.describe();
			System.out.println("------------------------------------");
			
			if (player1Card.getValue() > player2Card.getValue()) {
				System.out.println("Player 1 wins!!!");
				player1.incrementScore();
			} else if(player1Card.getValue() < player2Card.getValue()) {
				System.out.println("Player 2 wins!!!");
				player2.incrementScore();
			} else {
				System.out.println("It's a draw!");
			}
			System.out.println("Player 1 score: " + player1.getScore());
			System.out.println("Player 2 score: " + player2.getScore());
			System.out.println("************************************");
			}
			
			if (player1.getScore() > player2.getScore()) {
				System.out.println("Player 1 wins!");
			} else if (player1.getScore() < player2.getScore()) {
				System.out.println("Player 2 wins!!!");
			} else {
				System.out.println("It's a draw!!!");
			}
		
		
		

}}
