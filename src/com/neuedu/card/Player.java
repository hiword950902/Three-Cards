package com.neuedu.card;

import java.util.Arrays;

public class Player {
	private int id;// ���id
	private String name;// �������
	private Card[] cards = {};// ��������

	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// ��Card���������Card�ķ���
	public void add(Card card) {
		cards = Arrays.copyOf(cards, cards.length + 1);
		cards[cards.length - 1] = card;
	}

	@Override
	public String toString() {
		return id + "," + name + Arrays.toString(cards);
	}

	public static void main(String[] args) {
		Player p1 = new Player(1, "���");
		p1.add(new Card(0, 4));
		p1.add(new Card(4, 13));
		System.out.println(p1.toString());
	}
}
