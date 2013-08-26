package com.rmd.personal.projecteuler;

import java.util.HashMap;
import java.util.Map;

public class Problem5 implements Problem {

    private static final int DEFAULT_MAX_FACTOR = 20;
    private int maxFactor;

    public Problem5() {
        this.setMaxFactor(DEFAULT_MAX_FACTOR);
    }

    public int getMaxFactor() {
        return maxFactor;
    }

    public void setMaxFactor(int maxFactor) {
        this.maxFactor = maxFactor;
    }

    @Override
    public String getDescription() {
        return "2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any "
                + "remainder.\n\n"
                + "What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?";
    }

    @Override
    public String run() {
        Map<Integer, Integer> primePowers = new HashMap<Integer, Integer>();

        int currentPrime = 2;
        while (currentPrime < this.getMaxFactor()) {
            int currentPrimePower = 0;
            while (Math.pow(currentPrime, currentPrimePower + 1) < this.getMaxFactor()) {
                currentPrimePower++;
            }
            if (primePowers.get(currentPrime) == null || primePowers.get(currentPrime) < currentPrimePower) {
                primePowers.put(currentPrime, currentPrimePower);
            }
            currentPrime = Common.getNextPrime(currentPrime);
        }

        double product = 1;
        for (int prime : primePowers.keySet()) {
            product = product * Math.pow(prime, primePowers.get(prime));
        }

        return String.valueOf((long) product);
    }
}