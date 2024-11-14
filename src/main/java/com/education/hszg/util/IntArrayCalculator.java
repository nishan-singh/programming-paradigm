package com.education.hszg.util;

public class IntArrayCalculator {

    public static void main(String[] args) {
        IntArrayCalculator intArrayCalculator = new IntArrayCalculator();
        int[] A = {1, 2, 3, 4};

        System.out.println("The average is " + intArrayCalculator.calculateAverage(A));
    }

    public double calculateAverage(int[] A) {
        double sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        return sum / A.length;
    }
}
