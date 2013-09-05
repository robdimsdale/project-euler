package com.rmd.personal.projecteuler;

import java.util.HashMap;
import java.util.Map;

public class Problem18 implements Problem {

    private static final boolean DEFAULT_PROVIDED = false;

    private boolean provided;
    private int rowCount;

    private Map<Integer, int[]> numbersByLevel;

    public Problem18() {
        this.setProvided(DEFAULT_PROVIDED);
        this.numbersByLevel = new HashMap<Integer, int[]>();
    }

    public boolean isProvided() {
        return provided;
    }

    public void setProvided(boolean provided) {
        this.provided = provided;
    }

    private Map<Integer, int[]> getNumbersByLevel() {
        return this.numbersByLevel;
    }

    private int getRowCount() {
        return this.rowCount;
    }

    private void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    private void populateTriangle() {
        if (isProvided()) {
            this.setRowCount(4); // SUPPRESS CHECKSTYLE magicNumber

            this.getNumbersByLevel().put(0, new int[]{3}); // SUPPRESS CHECKSTYLE magicNumber
            this.getNumbersByLevel().put(1, new int[]{7, 4}); // SUPPRESS CHECKSTYLE magicNumber
            this.getNumbersByLevel().put(2, new int[]{2, 4, 6}); // SUPPRESS CHECKSTYLE magicNumber
            this.getNumbersByLevel().put(3, new int[]{8, 5, 9, 3}); // SUPPRESS CHECKSTYLE magicNumber
        } else {
            this.setRowCount(15); // SUPPRESS CHECKSTYLE magicNumber

            this.getNumbersByLevel().put(0, new int[]{75}); // SUPPRESS CHECKSTYLE magicNumber
            this.getNumbersByLevel().put(1, new int[]{95, 64}); // SUPPRESS CHECKSTYLE magicNumber
            this.getNumbersByLevel().put(2, new int[]{17, 47, 82}); // SUPPRESS CHECKSTYLE magicNumber
            this.getNumbersByLevel().put(3, new int[]{18, 35, 87, 10}); // SUPPRESS CHECKSTYLE magicNumber
            this.getNumbersByLevel().put(4, new int[]{20, 04, 82, 47, 65}); // SUPPRESS CHECKSTYLE magicNumber
            this.getNumbersByLevel().put(5, new int[]{19, 01, 23, 75, 03, 34}); // SUPPRESS CHECKSTYLE magicNumber
            this.getNumbersByLevel().put(6, new int[]{88, 02, 77, 73, 07, 63, 67}); // SUPPRESS CHECKSTYLE magicNumber
            this.getNumbersByLevel().put(7, new int[]{99, 65, 04, 28, 06, 16, 70, 92}); // SUPPRESS CHECKSTYLE magicNumber
            this.getNumbersByLevel().put(8, new int[]{41, 41, 26, 56, 83, 40, 80, 70, 33}); // SUPPRESS CHECKSTYLE magicNumber
            this.getNumbersByLevel().put(9, new int[]{41, 48, 72, 33, 47, 32, 37, 16, 94, 29}); // SUPPRESS CHECKSTYLE magicNumber
            this.getNumbersByLevel().put(10, new int[]{53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14}); // SUPPRESS CHECKSTYLE magicNumber
            this.getNumbersByLevel().put(11, new int[]{70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57}); // SUPPRESS CHECKSTYLE magicNumber
            this.getNumbersByLevel().put(12, new int[]{91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48}); // SUPPRESS CHECKSTYLE magicNumber
            this.getNumbersByLevel().put(13, new int[]{63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31}); // SUPPRESS CHECKSTYLE magicNumber
            this.getNumbersByLevel().put(14, new int[]{04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23}); // SUPPRESS CHECKSTYLE magicNumber
        }
    }

    @Override
    public String getDescription() {
        return "By starting at the top of the triangle below and moving to adjacent numbers on the row below, "
                + "the maximum total from top to bottom is 23.\n\n"
                + "   3\n"
                + "  7 4\n"
                + " 2 4 6\n"
                + "8 5 9 3\n\n"
                + "That is, 3 + 7 + 4 + 9 = 23.\n\n"
                + "Find the maximum total from top to bottom of the triangle below:\n\n"
                + "                     75\n"
                + "                    95 64\n"
                + "                  17 47 82\n"
                + "                 18 35 87 10\n"
                + "               20 04 82 47 65\n"
                + "              19 01 23 75 03 34\n"
                + "            88 02 77 73 07 63 67\n"
                + "           99 65 04 28 06 16 70 92\n"
                + "         41 41 26 56 83 40 80 70 33\n"
                + "        41 48 72 33 47 32 37 16 94 29\n"
                + "      53 71 44 65 25 43 91 52 97 51 14\n"
                + "     70 11 33 28 77 73 17 78 39 68 17 57\n"
                + "   91 71 52 38 17 14 91 43 58 50 27 29 48\n"
                + "  63 66 04 68 89 53 67 30 73 16 69 87 40 31\n"
                + "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23\n\n"
                + "NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route. "
                + "However, Problem 67, is the same challenge with a triangle containing one-hundred rows; it cannot be"
                + " solved by brute force, and requires a clever method! ;o)";
    }

    @Override
    public String run() {
        this.populateTriangle();

        long sum = this.getMaxTriangleSum(0, 0);

        return String.valueOf(sum);
    }

    private long getMaxTriangleSum(int currentRow, int currentIndex) {
        long subTriangleSum = 0;
        if (currentRow != this.getRowCount() - 1) {

            for (int possibleIndex : this.getPossibleIndicesForNextRow(currentRow, currentIndex)) {
                long possibleSum = this.getMaxTriangleSum(currentRow + 1, possibleIndex);
                if (possibleSum > subTriangleSum) {
                    subTriangleSum = possibleSum;
                }
            }
        }
        return subTriangleSum + this.getNumbersByLevel().get(currentRow)[currentIndex];
    }

    private int[] getPossibleIndicesForNextRow(int currentRow, int currentIndex) {
        int[] nextRow = this.getNumbersByLevel().get(currentRow + 1);
        if (nextRow == null) {
            return new int[]{};
        }

        if (currentIndex < nextRow.length - 1) {
            return new int[] {currentIndex, currentIndex + 1};
        }

        return new int[] {currentIndex};
    }
}
