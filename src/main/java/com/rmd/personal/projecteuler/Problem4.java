package com.rmd.personal.projecteuler;

public class Problem4 implements Problem {

    private static final int DEFAULT_NUMBER_OF_DIGITS = 3;
    private int numberOfDigits;

    public Problem4() {
        this.setNumberOfDigits(DEFAULT_NUMBER_OF_DIGITS);
    }

    public int getNumberOfDigits() {
        return numberOfDigits;
    }

    public void setNumberOfDigits(int numberOfDigits) {
        this.numberOfDigits = numberOfDigits;
    }

    @Override
    public String getDescription() {
        return "A palindromic number reads the same both ways. The largest palindrome made from the product of two "
                + "2-digit numbers is 9009 = 91 × 99.\n\n"
                + "Find the largest palindrome made from the product of two 3-digit numbers.";
    }

    @Override
    public String run() {

        return String.valueOf(this.findLargestPalindrome());
    }

    private long findLargestPalindrome() {
        long startVal = (long) Math.pow(10, this.getNumberOfDigits()) - 1; // SUPPRESS CHECKSTYLE magicNumber

        long largestPalindrome = 0;

        for (long numberA = startVal; numberA > 0; numberA--) {

            if (largestPalindrome > numberA * numberA) {
//                System.out.println(
//                        "^^^ can't get a * a bigger than existing largestPalindrome - break ^^^");
                return largestPalindrome;
            }

            for (long numberB = numberA; numberB > 0; numberB--) {
                long product = numberA * numberB;

                if (product < largestPalindrome) {

//                    System.out.println(numberA + " * " + numberB + " = " + product);
//                    System.out.println(
//                            "^^^ can't get a * b bigger than existing largestPalindrome "
//                                    + " - break to next-smallest a ^^^");
                    break;
                }

                if (this.isPalindromeNumber(product)) {

//                    System.out.println(numberA + " * " + numberB + " = " + product);
//                    System.out.println("^^^ new largest palindrome found ^^^");
                    largestPalindrome = product;
                    break;
                }

            }
        }

        return -1;
    }

    private boolean isPalindromeNumber(long number) {
        String numberAsString = String.valueOf(number);

        int forwardCharIndex = 0;
        int backwardCharIndex = numberAsString.length() - 1;

        boolean keepGoing = true;
        while (keepGoing) {
            char forwardChar = numberAsString.charAt(forwardCharIndex);
            char backwardChar = numberAsString.charAt(backwardCharIndex);

            if (forwardChar != backwardChar) {
                return false;
            }

            if (numberAsString.length() % 2 == 0) {
                keepGoing = forwardCharIndex < backwardCharIndex - 1;
            } else {
                keepGoing = forwardCharIndex < backwardCharIndex;
            }

            forwardCharIndex++;
            backwardCharIndex--;
        }

        return true;
    }
}
