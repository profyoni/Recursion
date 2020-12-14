package edu.touro.cs;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank && suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    @Override
    public String toString()
    {
        return String.format("%s of %sS", rank, suit);
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
