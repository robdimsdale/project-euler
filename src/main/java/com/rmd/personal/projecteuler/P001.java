package com.rmd.personal.projecteuler;

public class P001 implements Problem {

    private static final long DEFAULT_MAX_VALUE = 1000;
    private long maxValue;

    public P001() {
        this.setMaxValue(DEFAULT_MAX_VALUE);
    }

    @Override
    public String getDescription() {
        return "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, "
                + "6 and 9. The sum of these multiples is 23.\n"
                + "Find the sum of all the multiples of 3 or 5 below 1000.";
    }

    @Override
    public String run() {
        long highestMultipleOf3 = this.getHighestMultipleOfIntegerLessThanMaxValue(3); // SUPPRESS CHECKSTYLE magicNumber
        long highestMultipleOf5 = this.getHighestMultipleOfIntegerLessThanMaxValue(5); // SUPPRESS CHECKSTYLE magicNumber

        long highestMultipleOf3DividedBy3 = highestMultipleOf3 / 3; // SUPPRESS CHECKSTYLE magicNumber
        long highestMultipleOf5DividedBy5 = highestMultipleOf5 / 5; // SUPPRESS CHECKSTYLE magicNumber

        long sumOf3 = 3 * Common.sum(highestMultipleOf3DividedBy3); // SUPPRESS CHECKSTYLE magicNumber
        long sumOf5 = 5 * Common.sum(highestMultipleOf5DividedBy5); // SUPPRESS CHECKSTYLE magicNumber


        long highestMultipleOf15
                = this.getHighestMultipleOfIntegerLessThanMaxValue(15); // SUPPRESS CHECKSTYLE magicNumber
        long highestMultipleOf15DividedBy15 = highestMultipleOf15 / 15; // SUPPRESS CHECKSTYLE magicNumber

        long sumOf15 = 15 * (highestMultipleOf15DividedBy15 * (highestMultipleOf15DividedBy15 + 1)) / 2; // SUPPRESS CHECKSTYLE magicNumber

        return String.valueOf(sumOf3 + sumOf5 - sumOf15);
    }

    private long getHighestMultipleOfIntegerLessThanMaxValue(long multiple) {
        long highestMultiple = this.getMaxValue() - 1;
        while (highestMultiple % multiple != 0) {
            highestMultiple--;
        }
        return highestMultiple;
    }

    public long getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(long maxValue) {
        this.maxValue = maxValue;
    }
}
