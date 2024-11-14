package com.education.hszg.bmi;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class TestBMICalculator {
    private BMICalculator bmiCalculator;

    @Before
    public void before() {
        bmiCalculator = new BMICalculator();
    }

    @After
    public void after() {
        bmiCalculator = null;
    }


    @Test
    @Parameters({
            "85.123,    1.78,   26.86",
            "-5.5,      1.24,   0",
            "233,       1.24,   0",
            "85.7,      0.78,   0",
            "66.0,      820.7,  0",
    })
    public void testCalculateBMI(double weightInKG, double heightInMeters, double bmi) {
        assertEquals(bmi, bmiCalculator.calculateBMI(weightInKG, heightInMeters), 0.1);
    }

    @Test
    @Parameters({
            "85.123,    1.78,   hit gym",
            "-5.5,      1.24,   Eat more",
            "233,       1.24,   Eat more",
            "85.7,      0.78,   Eat more",
            "67.72,     1.80,   Eat more",
            "77.44,     1.80,   You are doing good!",
            "78.08,     1.80,   hit gym",
    })
    public void testGetBMIRecommendation(double weightInKG, double heightInMeters, String recommendation) {
        assertEquals(recommendation, bmiCalculator.getBMIRecommendation(weightInKG, heightInMeters));
    }
}