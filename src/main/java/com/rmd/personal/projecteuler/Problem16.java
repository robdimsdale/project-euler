package com.rmd.personal.projecteuler;

import java.math.BigInteger;

public class Problem16 implements Problem {

    private static final int DEFAULT_POWER = 1000;

    private int power;

    public Problem16() {
        this.setPower(DEFAULT_POWER);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String getDescription() {
        return "215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.\n\n"
                + "What is the sum of the digits of the number 21000?";
    }

    @Override
    public String run() {
        BigInteger bigInteger = new BigInteger("2");
        bigInteger = bigInteger.pow(this.getPower()); // SUPPRESS CHECKSTYLE magicNumber
        String numberAsString = String.valueOf(bigInteger);
        long sum = 0;
        for (int i = 0; i < numberAsString.length(); i++) {
            sum += Integer.valueOf(numberAsString.substring(i, i + 1));
        }
        return String.valueOf(sum);
    }
}
