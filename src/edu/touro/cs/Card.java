package edu.touro.cs;

import java.util.LinkedList;
import java.util.List;

public class Card implements Comparable<Card> {
    private Rank rank;
    private Suit suit;

    private Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public static List<Card> deck() {
        List<Card> ret = new LinkedList<>();
        for (Rank r : Rank.values()) {
            for (Suit s : Suit.values()) {
                ret.add(new Card(r, s));
            }
        }
        return ret;
    }

    @Override
    public int compareTo(Card anotherCard) {
        int diff = this.rank.compareTo(anotherCard.rank);
        if (diff != 0)
            return diff;
        diff = this.suit.compareTo(anotherCard.suit);
        return diff;
    }
}
