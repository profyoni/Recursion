package edu.touro.cs;

public class Sorts {

    public static <T> void swap(T[] list, int index1, int index2)
    {
        T temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }


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

    public static int maximum(int[] list) {
        int ret = list[0];
        for (int i=1;i<list.length;i++)
            if (list[i] > ret)
                ret = list[i];
        return ret;
    }
}
