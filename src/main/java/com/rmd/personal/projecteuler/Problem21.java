package com.rmd.personal.projecteuler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem21 implements Problem {

    private static final int DEFAULT_START = 1;
    private static final int DEFAULT_END = 10000;

    private long start;
    private long end;

    private Map<Long, Long> valueToDivisorSum;

    public Problem21() {
        this.setStart(DEFAULT_START);
        this.setEnd(DEFAULT_END);

        this.valueToDivisorSum = new HashMap<Long, Long>();
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    private Map<Long, Long> getValueToDivisorSum() {
        return valueToDivisorSum;
    }

    @Override
    public String getDescription() {
        return "Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into "
                + "n).\n"
                + "If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are "
                + "called amicable numbers.\n\n"
                + "For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, "
                + "55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, "
                + "71 and 142; so d(284) = 220.\n\n"
                + "Evaluate the sum of all the amicable numbers under 10000.";
    }

    @Override
    public String run() {
        for (long i = this.getStart(); i < this.getEnd(); i++) {
            long divisorSum = 0;
            List<Long> factors = Common.findFactors(i);
            for (Long divisor : factors) {
                if (divisor < i) {
                    divisorSum += divisor;
                }
            }
            this.getValueToDivisorSum().put(i, divisorSum);
        }
        long sum = 0;

        Map<Long, Long> amicableNumbers = new HashMap<Long, Long>();
        for (long value : this.getValueToDivisorSum().keySet()) {
            // skip numbers we've already recorded the sum for.
            if (amicableNumbers.containsKey(value)) {
                continue;
            }
            long divisorSum = this.getValueToDivisorSum().get(value);
            // If the sum and the value are the same (e.g. 28) then it won't have an amicable pair so skip it.
            if (divisorSum == value) {
                continue;
            }
            if (this.getValueToDivisorSum().containsKey(divisorSum)) {
                if (this.getValueToDivisorSum().get(divisorSum) == value) {
                    sum += divisorSum;
                    sum += value;
                    amicableNumbers.put(value, divisorSum);
                    amicableNumbers.put(divisorSum, value);
                }
            }
        }

        return String.valueOf(sum);
    }
}
