package edu.touro.cs;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortsTest {

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