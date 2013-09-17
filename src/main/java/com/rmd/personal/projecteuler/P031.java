package com.rmd.personal.projecteuler; // SUPPRESS CHECKSTYLE fileLength

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class P031 implements Problem {

    private static final int DEFAULT_TOTAL = 200;
    private static final int[] DEFAULT_COINS = {1, 2, 5, 10, 20, 50, 100, 200};

    private int total;

    private int[] coins;
    private Map<Integer, Set<List<Integer>>> knownCombinationsByValue;
    private Map<Integer, Integer> knownCountsByValue;

    public P031() {
        this.knownCombinationsByValue = new HashMap<Integer, Set<List<Integer>>>(this.getTotal());
        this.knownCountsByValue = new HashMap<Integer, Integer>(this.getTotal());
        this.setTotal(DEFAULT_TOTAL);
        this.setCoins(DEFAULT_COINS);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private int[] getCoins() {
        return this.coins;
    }

    private void setCoins(int[] coins) {
        this.coins = coins;
        Arrays.sort(coins);
    }

    private Map<Integer, Set<List<Integer>>> getKnownCombinationsByValue() {
        return this.knownCombinationsByValue;
    }

    private Map<Integer, Integer> getKnownCountsByValue() {
        return this.knownCountsByValue;
    }

    @Override
    public String getDescription() {
        return "In England the currency is made up of pound, £, and pence, p, "
                + "and there are eight coins in general circulation:\n\n"
                + "1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).\n"
                + "It is possible to make £2 in the following way:\n\n"
                + "1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p\n"
                + "How many different ways can £2 be made using any number of coins?";
    }

    @Override
    public String run() {
        for (int i = 1; i <= this.getTotal(); i++) {
            this.countNumberOfWaysOfMakingVal(i);
            System.out.println("Calculated: " + i);
        }

        return String.valueOf(this.getKnownCountsByValue().get(this.getTotal()));
    }

    private void countNumberOfWaysOfMakingVal(int value) {
        for (int coin : this.getCoins()) {
            if (coin > value) {
                break; // We know the coins are sorted (i.e. ordered) so don't bother looking at the rest.
            }
            if (coin == value) {
                this.updateKnownCombinationsAndCount(new ArrayList<Integer>(), value, coin);
            } else { // coin < value
                for (List<Integer> combination : this.getKnownCombinationsByValue().get(value - coin)) {
                    List<Integer> currentCombination = new ArrayList<Integer>(combination);
                    this.updateKnownCombinationsAndCount(currentCombination, value, coin);
                }
            }
        }
    }

    private void updateKnownCombinationsAndCount(List<Integer> currentCombination, int value, int coin) {
        currentCombination.add(coin);
        Collections.sort(currentCombination);
        Set<List<Integer>> knownCombinationsAtValue = this.getKnownCombinationsByValue().get(value);
        if (knownCombinationsAtValue == null) {
            knownCombinationsAtValue = new HashSet<List<Integer>>();
            this.getKnownCombinationsByValue().put(value, knownCombinationsAtValue);
        }
        boolean addedNew = knownCombinationsAtValue.add(currentCombination);
        if (addedNew) {
            this.incrementKnownCountForValue(value);
        }
    }

    private void incrementKnownCountForValue(int key) {
        Map<Integer, Integer> map = this.getKnownCountsByValue();
        if (map.containsKey(key)) {
            map.put(key, map.get(key) + 1);
        } else {
            map.put(key, 1);
        }
    }
}
