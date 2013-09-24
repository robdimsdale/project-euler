package com.rmd.personal.projecteuler;

import java.util.HashSet;
import java.util.Set;

public class P032 implements Problem {

    private static final int DEFAULT_START = 1;
    private static final int DEFAULT_END = 9876;

    private int start;
    private int end;

    public P032() {
        this.setStart(DEFAULT_START);
        this.setEnd(DEFAULT_END);
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String getDescription() {
        return "We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n "
                + "exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.\n\n"
                + "The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, "
                + "multiplier, and product is 1 through 9 pandigital.\n\n"
                + "Find the sum of all products whose multiplicand/multiplier/product identity can be "
                + "written as a 1 through 9 pandigital.\n\n"
                + "HINT: Some products can be obtained in more than one way so be sure to only include "
                + "it once in your sum.";
    }

    @Override
    public String run() {
        Set<Long> products = new HashSet<Long>();

        for (long i = this.getStart(); i <= this.getEnd(); i++) {
            for (long j = i; j <= this.getEnd(); j++) {
                long product = i * j;
                if (product <= DEFAULT_END) {
                    if (this.isPandigital(i, j, product)) {
                        products.add(product);
                    }
                }
            }
        }

        long sum = 0;
        for (long product : products) {
            sum += product;
        }

        return String.valueOf(sum);
    }

    private boolean isPandigital(long multiplicand, long multiplier, long product) {
        boolean[] containedDigits = new boolean[10]; // SUPPRESS CHECKSTYLE magicNumber
        containedDigits[0] = true; // We don't care about the '0' digit so mask to true.

        while (multiplicand > 0) {
            int digit = (int) multiplicand % 10; // SUPPRESS CHECKSTYLE magicNumber
            if (containedDigits[digit]) {
                return false;
            }
            containedDigits[digit] = true;
            multiplicand /= 10; // SUPPRESS CHECKSTYLE magicNumber
        }

        while (multiplier > 0) {
            int digit = (int) multiplier % 10; // SUPPRESS CHECKSTYLE magicNumber
            if (containedDigits[digit]) {
                return false;
            }
            containedDigits[digit] = true;
            multiplier /= 10; // SUPPRESS CHECKSTYLE magicNumber
        }

        while (product > 0) {
            int digit = (int) product % 10; // SUPPRESS CHECKSTYLE magicNumber
            if (containedDigits[digit]) {
                return false;
            }
            containedDigits[digit] = true;
            product /= 10; // SUPPRESS CHECKSTYLE magicNumber
        }

        for (boolean contained : containedDigits) {
            if (!contained) {
                return false;
            }
        }
        return true;
    }
}