package main.game.models;

import main.game.enums.Rank;
import main.game.enums.Suite;

public class Card implements Comparable<Card> {

	private final Suite suite;
	private final Rank rank;

	public Card(String strCard) {
		this.rank = Rank.getRankFromChar(strCard.charAt(0));
		this.suite = Suite.getSuiteFromText(strCard.charAt(1));
	}

	public Suite getSuite() {
		return suite;
	}

	public Rank getRank() {
		return rank;
	}

	@Override
	public int compareTo(Card other) {
		return rank.compareTo(other.rank);
	}

}