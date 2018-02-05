package com.neuedu.card;

import java.util.Arrays;

public class Player {
	private int id;// 玩家id
	private String name;// 玩家姓名
	private Card[] cards = {};// 卡牌数组

	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// 向Card数组中添加Card的方法
	public void add(Card card) {
		cards = Arrays.copyOf(cards, cards.length + 1);
		cards[cards.length - 1] = card;
	}

	@Override
	public String toString() {
		return id + "," + name + Arrays.toString(cards);
	}

	public static void main(String[] args) {
		Player p1 = new Player(1, "大哥");
		p1.add(new Card(0, 4));
		p1.add(new Card(4, 13));
		System.out.println(p1.toString());
	}
}
