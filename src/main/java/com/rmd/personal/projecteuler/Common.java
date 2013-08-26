package com.rmd.personal.projecteuler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class Common {

    private static final int MAX_PRIME_VALUE = 10000000;

    private Common() {

    }

    private static List<Long> primes;

    static {
        primes = new ArrayList<Long>();
        populatePrimesUpTo(MAX_PRIME_VALUE);
    }

    protected static List<Long> getPrimes() {
        return primes;
    }

    private static void populatePrimesUpTo(int end) {
        System.out.println("populating primes up to: " + end);
        Date startTime = new Date();

        boolean[] values = new boolean[end];

        for (int i = 2; i < end; i++) {
            if (!values[i]) {
                primes.add((long) i);
                for (int j = i; j < end; j += i) {
                    values[j] = true;
                }
            }
        }
        Date endTime = new Date();

        System.out.println("done - took " + (endTime.getTime() - startTime.getTime()) + " ms.");
    }

    protected static long sum(long n) {
        return (n * (n + 1)) / 2;
    }
}
