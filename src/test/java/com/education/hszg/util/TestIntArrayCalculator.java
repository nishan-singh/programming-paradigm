package com.education.hszg.util;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class TestIntArrayCalculator {

    private IntArrayCalculator intArrayCalculator; 

    @Before
    public void before() {
        intArrayCalculator = new IntArrayCalculator();
    }

    @After
    public void after() {
        intArrayCalculator = new IntArrayCalculator();
    }

    @Test
    @Parameters({
            "1,                 1.0",
            "1-1-1-1-1-1,       1.0",
            "1-2-3-4-5-6,       2.5",
            "1-2-3-4-5-6-7,     4.0",
            "1-7-3-4-2-6-5,     4.0",
            "7-6-5-4-3-2-1,     4.0",
    })
    public void testCalcuateAverage(String arrayNumbers, double average) {
        final String[] split = arrayNumbers.split("-");
        int[] numbers = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            numbers[i] = Integer.parseInt(split[i]);
        }

        Assert.assertEquals(
            average,
            intArrayCalculator.calculateAverage(numbers),
            0.05
        );
    }
}