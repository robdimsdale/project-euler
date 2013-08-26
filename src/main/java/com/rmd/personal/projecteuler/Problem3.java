package com.rmd.personal.projecteuler;

public class Problem3 implements Problem {

    private static final long DEFAULT_NUMBER_VALUE = 600851475143L;
    private long numberValue;

    public Problem3() {
        this.setNumberValue(DEFAULT_NUMBER_VALUE);
    }

    public long getNumberValue() {
        return numberValue;
    }

    public void setNumberValue(long numberValue) {
        this.numberValue = numberValue;
    }

    @Override
    public String getDescription() {
        return "The prime factors of 13195 are 5, 7, 13 and 29.\n\n"
                + "What is the largest prime factor of the number 600851475143 ?";
    }

    @Override
    public String run() {
        long currentNumber = this.getNumberValue();

        int currentPrime = 2;

        while (currentPrime < currentNumber) {
            if (currentNumber % currentPrime == 0) {
                currentNumber = currentNumber / currentPrime;
            } else {
                currentPrime = Common.getNextPrime(currentPrime);
            }
        }

        return String.valueOf(currentPrime);
    }
}
