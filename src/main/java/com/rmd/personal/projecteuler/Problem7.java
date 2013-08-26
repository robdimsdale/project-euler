package com.rmd.personal.projecteuler;

import java.util.HashSet;
import java.util.Set;

public class Problem7 implements Problem {

    private static final int DEFAULT_DESIRED_PRIME_NUMBER_INDEX = 10001;
    private int desiredPrimeNumberIndex;

    public Problem7() {
        this.setDesiredPrimeNumberIndex(DEFAULT_DESIRED_PRIME_NUMBER_INDEX);
    }

    public int getDesiredPrimeNumberIndex() {
        return desiredPrimeNumberIndex;
    }

    public void setDesiredPrimeNumberIndex(int desiredPrimeNumberIndex) {
        this.desiredPrimeNumberIndex = desiredPrimeNumberIndex;
    }

    @Override
    public String getDescription() {
        return "By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, "
                + " we can see that the 6th prime is 13.\n\n"
                + "What is the 10 001st prime number?";
    }

    @Override
    public String run() {

        Set<Long> primes = new HashSet<Long>();
        primes.add(2L);

        final long startingPrime = 3;

        long largestPrime = startingPrime;

        long currentNumber = startingPrime;
        while (primes.size() < this.getDesiredPrimeNumberIndex()) {

            boolean noPrimeFactors = true;
            for (long prime : primes) {
                if (currentNumber % prime == 0) {
                    noPrimeFactors = false;
                    break;
                }
            }

            if (noPrimeFactors) {
                largestPrime = currentNumber;
                primes.add(currentNumber);
            }

            currentNumber += 2; // Skip by two as we only care about every odd number.
        }

        return String.valueOf(largestPrime);
    }
}
