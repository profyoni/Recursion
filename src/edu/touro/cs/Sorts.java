package edu.touro.cs;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

// how can you use the Collections.sort method with a comparator to shuffle your list?

public class Sorts {

    private static Random rand = new Random();
    public static <T> void shuffle(List<T> list)
    {
        for (int i=0;i < list.size();i++)
        {
            int newLocation = rand.nextInt(list.size());
            swap(list, i, newLocation);
        }
    }

    static void setSeed(int seed){
        rand.setSeed(seed);
    }

    private static <T> void swap(List<T> list, int index1, int index2)
    {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    private static <T> void swap(T[] list, int index1, int index2)
    {
        T temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

    // TODO
    public static <T extends Comparable<T> > void selectionSort(T[] list)
    {// avoid O(n^2) swaps and just find max and put in place once (O(n) swaps
        // will still have O(n^2) comparisons
        for (int i = 0;i < list.length - 1; i++) // get the max and move it up
        {
            // comparing neighboring elts
            for (int j = 0; j < list.length - 1 - i; j++)
            {
                if ( list[j].compareTo(list[j+1]) > 0)
                    swap(list,j,j+1);
            }
        }
    }


    public static <T extends Comparable<T> > void bubbleSort(T[] list)
    {
        for (int i = 0;i < list.length - 1; i++) // get the max and move it up
        {
            // comparing neighboring elts
            for (int j = 0; j < list.length - 1 - i; j++)
            {
                if ( list[j].compareTo(list[j+1]) > 0)
                    swap(list,j,j+1);
            }
        }
    } // O( (n-1)^2) = O(n^2 - 2n + 1), O(n^2/2)


    public static <T extends Comparable<T> > void bubbleSort(List<T> list)
    {
        for (int i = 0;i < list.size() - 1; i++) // get the max and move it up
        {
            // comparing neighboring elts
            for (int j = 0; j < list.size() - 1 - i; j++)
            {
                if ( list.get(j).compareTo(list.get(j+1)) > 0)
                    swap(list,j,j+1);
            }
        }
    } // O( (n-1)^2) = O(n^2 - 2n + 1), O(n^2/2)

    public static int maximum(int[] list) {
        int ret = list[0];
        for (int i=1;i<list.length;i++)
            if (list[i] > ret)
                ret = list[i];
        return ret;
    }
}
