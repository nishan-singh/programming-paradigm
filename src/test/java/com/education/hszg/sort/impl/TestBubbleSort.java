package com.education.hszg.sort.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class TestBubbleSort {       
    private BubbleSort bubbleSort;

    @Before
    public void before() {
        bubbleSort = new BubbleSort();
    }

    @After
    public void after() {
        bubbleSort = null;
    }

    @Test
    @Parameters({
            "7-7-7-7-7,        7-7-7-7-7",
            "9-8-7-6-5-4,      4-5-6-7-8-9",
            "1-2-3-4-5-6,      1-2-3-4-5-6",
            "7-7-7-4-7,        4-7-7-7-7",
            "7,                7",
    })
    public void testSort(String unsorted, String sorted) {
        String[] split = unsorted.split("-");
        int[] unsortedNumbers = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            unsortedNumbers[i] = Integer.parseInt(split[i]);
        }

        split = unsorted.split("-");
        int[] sortedNumbers = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            sortedNumbers[i] = Integer.parseInt(split[i]);
        }

        Assert.assertArrayEquals(
                sortedNumbers,
                bubbleSort.bubbleSortImpl(unsortedNumbers)
        );
    }
}
