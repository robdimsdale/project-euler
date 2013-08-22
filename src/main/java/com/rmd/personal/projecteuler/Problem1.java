package com.rmd.personal.projecteuler;

public class Problem1 implements Problem {

    private final int defaultMaxValue = 1000;
    private int maxValue = defaultMaxValue;

    @Override
    public String getDescription() {
        return "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, "
                + "6 and 9. The sum of these multiples is 23.\n"
                + "Find the sum of all the multiples of 3 or 5 below 1000.";
    }

    @Override
    public String run() {
        int highestMultipleOf3 = this.getHighestMultipleOfIntegerLessThanMaxValue(3); // SUPPRESS CHECKSTYLE magicNumber
        int highestMultipleOf5 = this.getHighestMultipleOfIntegerLessThanMaxValue(5); // SUPPRESS CHECKSTYLE magicNumber

        int highestMultipleOf3DividedBy3 = highestMultipleOf3 / 3; // SUPPRESS CHECKSTYLE magicNumber
        int highestMultipleOf5DividedBy5 = highestMultipleOf5 / 5; // SUPPRESS CHECKSTYLE magicNumber

        int sumOf3 = 3 * (highestMultipleOf3DividedBy3 * (highestMultipleOf3DividedBy3 + 1)) / 2; // SUPPRESS CHECKSTYLE magicNumber
        int sumOf5 = 5 * (highestMultipleOf5DividedBy5 * (highestMultipleOf5DividedBy5 + 1)) / 2; // SUPPRESS CHECKSTYLE magicNumber


        int highestMultipleOf15
                = this.getHighestMultipleOfIntegerLessThanMaxValue(15); // SUPPRESS CHECKSTYLE magicNumber
        int highestMultipleOf15DividedBy15 = highestMultipleOf15 / 15; // SUPPRESS CHECKSTYLE magicNumber

        int sumOf15 = 15 * (highestMultipleOf15DividedBy15 * (highestMultipleOf15DividedBy15 + 1)) / 2; // SUPPRESS CHECKSTYLE magicNumber

        return String.valueOf(sumOf3 + sumOf5 - sumOf15);
    }

    private int getHighestMultipleOfIntegerLessThanMaxValue(int multiple) {
        int highestMultiple = this.getMaxValue() - 1;
        while (highestMultiple % multiple != 0) {
            highestMultiple--;
        }
        return highestMultiple;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }
}
