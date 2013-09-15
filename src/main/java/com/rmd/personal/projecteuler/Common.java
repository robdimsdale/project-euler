package com.rmd.personal.projecteuler;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    protected static Map<Long, Integer> findPrimeFactorTreeForValue(long value) {

        Map<Long, Integer> factorTree = new HashMap<Long, Integer>();

        boolean[] values = new boolean[(int) value];

        for (int i = 2; i < value; i++) {
            if (!values[i]) {
                for (int j = i; j < value; j += i) {
                    values[j] = true;
                    if (value % j == 0 && hasOnlyMultiplesOfPrime(j, i)) {
                        long iAsLong = (long) i;
                        if (factorTree.containsKey(iAsLong)) {
                            factorTree.put(iAsLong, factorTree.get(iAsLong) + 1);
                        } else {
                            factorTree.put(iAsLong, 1);
                        }
                    }
                }
            }
        }

        return factorTree;
    }

    private static boolean hasOnlyMultiplesOfPrime(long value, long prime) {
        return value == prime || value % prime == 0 && hasOnlyMultiplesOfPrime(value / prime, prime);
    }

    protected static List<Long> findFactors(long value) {
        List<Long> factors = new ArrayList<Long>();
        for (long i = 1; i <= value; i++) {
            if (value % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    protected static long sumDigitsInString(String numberAsString) {
        long sum = 0;
        for (int i = 0; i < numberAsString.length(); i++) {
            sum += Integer.valueOf(numberAsString.substring(i, i + 1));
        }
        return sum;
    }

    protected static long factorial(long n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            throw new IllegalArgumentException("Can only calculate factorial for non-negative n.");
        }

        final long maxInput = 39;
        if (n > maxInput) {
            throw new IllegalArgumentException("Can only calculate factorial for max input: " + maxInput + ".");
        }

        long result = 1;
        for (long i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    protected static long sumOfFactorsPrime(int number, List<Long> primelist) {
        long n = number;
        long sum = 1;
        long p = primelist.get(0);
        long j;
        int i = 0;

        while (p * p <= n && n > 1 && i < primelist.size()) {
            p = primelist.get(i);
            i++;
            if (n % p == 0) {
                j = p * p;
                n = n / p;
                while (n % p == 0) {
                    j = j * p;
                    n = n / p;
                }
                sum = sum * (j - 1) / (p - 1);
            }
        }

        //A prime factor larger than the square root remains
        if (n > 1) {
            sum *= n + 1;
        }
        return sum - number;
    }
}
