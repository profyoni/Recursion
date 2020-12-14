package edu.touro.cs;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortsTest {

    @org.junit.jupiter.api.Test
    void toString2() {
        List<Card> cards = Card.deck();
        Card first = cards.get(0);

        assertEquals("ACE of CLUBS", first.toString());
    }

    @org.junit.jupiter.api.Test
    void shuffleAndSort() {
        List<Card> cards = Card.deck();

        Card first = cards.get(0),
             last = cards.get(51);

        Sorts.shuffle(cards);

        Sorts.bubbleSort(cards);


        assertEquals(first, cards.get(0));
        assertEquals(last, cards.get(51));


    }

    @org.junit.jupiter.api.Test
    void shuffle() {
        Sorts.setSeed(613);
        final int MAX_ITERATIONS = 100_000;
        final double DELTA = 0.001;

        String [] list = {"W","R","I","T","E"};
        List<String> list2 = Arrays.asList(list);

        int eCounter = 0;
        for (int i=0;i<MAX_ITERATIONS;i++)
        {
            Sorts.shuffle(list2);
            if (list2.get(0).equals("E"))
                eCounter++;
        }

        double freq = eCounter / (double) MAX_ITERATIONS;

        assertEquals(1.0 / list.length, freq, DELTA);
    }

    @org.junit.jupiter.api.Test
    void bubbleSort() {
        String [] list = {"W","R","I","T","E"};

        Sorts.bubbleSort(list);

        assertEquals("E", list[0]);
        assertEquals("W", list[4]);
    }


    @org.junit.jupiter.api.Test
    void sort1() {
        int [] list = {6,3,8,4,7,4,9,0};
        int max = Sorts.maximum(list);
        int [] nums = new int[max + 1];

        for (int i : list)
        {
            nums[i]++;
        }

        int count = 0;
        for ( int i=0;i<nums.length;i++) {
            for (int j=0;j<nums[i]; j++)
                list[count++] = i;
        }

        assertEquals(0, list[0]);
        assertEquals(6, list[4]);
        assertEquals(9, list[7]);
    }
}