package com.neuedu.card;

public class Card {
	private int suit;// 花色
	private int rank;// 点数
	// 花色常量
	public static final int CLUB = 0;// 梅花
	public static final int DIAMOND = 1;// 方块
	public static final int HERAT = 2;// 红桃
	public static final int SPADE = 3;// 黑桃
	public static final int JOKER = 4;// 王
	// 点数常量
	public static final int THREE = 0;
	public static final int FOUR = 1;
	public static final int FIVE = 2;
	public static final int SIX = 3;
	public static final int SEVEN = 4;
	public static final int EIGHT = 5;
	public static final int NINE = 6;
	public static final int TEN = 7;
	public static final int JACK = 8;// J
	public static final int QUEEN = 9;// Q
	public static final int KING = 10;// K
	public static final int ACE = 11;// A
	public static final int DEUCE = 12;// 2
	public static final int BLACK = 13;// 小王
	public static final int COLOR = 14;// 大王

	public static final String[] SUIT_NAME = { "♣", "♢", "❤", "♠" };
	public static final String[] RANK_NAME = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", "小王",
			"大王" };

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		if (suit < CLUB || suit > JOKER) {
			throw new RuntimeException("没有这种花色");
		}
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		if (rank < THREE || rank > COLOR) {
			throw new RuntimeException("没有这种点数");
		}
		this.rank = rank;
	}

	@Override
	public String toString() {
		return SUIT_NAME[suit] + RANK_NAME[rank];
	}

	public Card(int suit, int rank) {
		super();
		setSuit(suit);
		setRank(rank);
		// this.suit = suit;
		// this.rank = rank;
	}

	public static void main(String[] args) {
		Card card = new Card(-1, 22);
		System.out.println(card.toString());
	}

}
