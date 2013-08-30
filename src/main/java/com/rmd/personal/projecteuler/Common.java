package com.rmd.personal.projecteuler;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public final class Common {

    private static final int MAX_PRIME_VALUE = 20000000;

    private Common() {

    }

    private static List<Long> primes;

    static {
        primes = new LinkedList<Long>();
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

    protected static long sumPrimesUpTo(int end) {
        boolean[] values = new boolean[end];

        long sum = 0;

        for (int i = 2; i < end; i++) {
            if (!values[i]) {
                primes.add((long) i);
                sum += i;
                for (int j = i; j < end; j += i) {
                    values[j] = true;
                }
            }
        }
        return sum;
    }

    protected static long sum(long n) {
        return (n * (n + 1)) / 2;
    }
}
