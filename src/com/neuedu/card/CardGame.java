package com.neuedu.card;

import java.util.Arrays;
import java.util.Random;

public class CardGame {
	public void sendCard() {
		Card[] cards = new Card[54];
		int count = 0;// ¼ÇÂ¼ÅÆµÄ¼ÆÊıÆ÷
		for (int rank = Card.THREE; rank <= Card.DEUCE; rank++) {
			cards[count++] = new Card(Card.CLUB, rank);
			cards[count++] = new Card(Card.HERAT, rank);
			cards[count++] = new Card(Card.SPADE, rank);
			cards[count++] = new Card(Card.DIAMOND, rank);
		}
		cards[count++] = new Card(Card.JOKER, Card.BLACK);
		cards[count++] = new Card(Card.CLUB, Card.COLOR);
		System.out.println(Arrays.toString(cards));
		// Ï´ÅÆ
		Random r = new Random();
		for (count = cards.length - 1; count >= 1; count--) {
			int newCardIndex = r.nextInt(count);
			Card card = cards[newCardIndex];
			cards[newCardIndex] = cards[count];
			cards[count] = card;
		}
		System.out.println(Arrays.toString(cards));
		Player[] players = { new Player(1, "ÔøÖ¾Î°"), new Player(2, "Áº³¯Î°"), new Player(3, "ÁõµÂ»ª"), };
		int playerCount = 0;
		for (count = 0; count < cards.length - 3; count++) {
			Card card = cards[count];
			players[playerCount++ % players.length].add(card);
		}
		System.out.println(players[0]);
		System.out.println(players[1]);
		System.out.println(players[2]);
		System.out.println(
				"µ×ÅÆ:[" + cards[cards.length - 3] + "," + cards[cards.length - 2] + "," + cards[cards.length - 1] + "]");
	}

}
