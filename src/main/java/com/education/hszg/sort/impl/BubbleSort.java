package com.education.hszg.sort.impl;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.bubbleSortImpl(new int[]{3, 7, 4, 1, 8})));
    }

    public int[] bubbleSortImpl(int[] listToSort) {

        for (int i = 0; i < listToSort.length; i++) {
            for(int j = 0; j < listToSort.length - 1; j++) {
                if (listToSort[i] < listToSort[j])
                    swap(listToSort, i, j);
            }
        }

        return listToSort;
    }

    public void swap(int[] listToSwapFrom, int firstElemIndex, int secondElemIndex) {
        int temp = listToSwapFrom[firstElemIndex];
        listToSwapFrom[firstElemIndex] = listToSwapFrom[secondElemIndex];
        listToSwapFrom[secondElemIndex] = temp;
    }
}