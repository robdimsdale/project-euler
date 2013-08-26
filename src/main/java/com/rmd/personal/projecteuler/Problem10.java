package com.rmd.personal.projecteuler;

public class Problem10 implements Problem {

    private static final int DEFAULT_MAX_PRIME = 2000000;
    private int maxPrime;

    public Problem10() {
        this.setMaxPrime(DEFAULT_MAX_PRIME);
    }

    public int getMaxPrime() {
        return maxPrime;
    }

    public void setMaxPrime(int maxPrime) {
        this.maxPrime = maxPrime;
    }

    @Override
    public String getDescription() {
        return "The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.\n\n"
                + "Find the sum of all the primes below two million.";
    }

    @Override
    public String run() {

        long currentPrime = 2L;
        long primeSum = 0;

        while (currentPrime < this.getMaxPrime()) {
            primeSum += currentPrime;
            currentPrime = Common.getPrimes().get(Common.getPrimes().indexOf(currentPrime) + 1);
        }

        return String.valueOf(primeSum);
    }
}
