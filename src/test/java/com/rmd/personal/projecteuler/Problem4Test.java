package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem4Test extends AbstractProblemTestBase<Problem4> {

    public Problem4Test() {
        super(new Problem4());
    }

    @Test
    public void runReturnsCorrectlyForProductOfTwoDigits() {
        // Arrange
        final int digitCount = 2;
        this.getProblem().setNumberOfDigits(digitCount);

        // Act
        long returnedMaxPalindrome = Long.valueOf(this.getProblem().run());

        // Assert
        final long expectedMaxPalindrome = 9009L;
        assertEquals(expectedMaxPalindrome, returnedMaxPalindrome);
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        long returnedMaxPalindrome = Long.valueOf(this.getProblem().run());

        // Assert
        final long expectedMaxPalindrome = 906609L;
        assertEquals(expectedMaxPalindrome, returnedMaxPalindrome);
    }

    @Test
    public void runReturnsCorrectlyForProductOfFourDigits() {
        // Arrange
        final int digitCount = 4;
        this.getProblem().setNumberOfDigits(digitCount);

        // Act
        long returnedMaxPalindrome = Long.valueOf(this.getProblem().run());

        // Assert
        final long expectedMaxPalindrome = 99000099L;
        assertEquals(expectedMaxPalindrome, returnedMaxPalindrome);
    }

    @Test
    public void runReturnsCorrectlyForProductOfFiveDigits() {
        // Arrange
        final int digitCount = 5;
        this.getProblem().setNumberOfDigits(digitCount);

        // Act
        long returnedMaxPalindrome = Long.valueOf(this.getProblem().run());

        // Assert
        final long expectedMaxPalindrome = 9966006699L;
        assertEquals(expectedMaxPalindrome, returnedMaxPalindrome);
    }

    @Test
    public void runReturnsCorrectlyForProductOfSixDigits() {
        // Arrange
        final int digitCount = 6;
        this.getProblem().setNumberOfDigits(digitCount);

        // Act
        long returnedMaxPalindrome = Long.valueOf(this.getProblem().run());

        // Assert
        final long expectedMaxPalindrome = 999000000999L;
        assertEquals(expectedMaxPalindrome, returnedMaxPalindrome);
    }

    @Test
    public void runReturnsCorrectlyForProductOfSevenDigits() {
        // Arrange
        final int digitCount = 7;
        this.getProblem().setNumberOfDigits(digitCount);

        // Act
        long returnedMaxPalindrome = Long.valueOf(this.getProblem().run());

        // Assert
        final long expectedMaxPalindrome = 99956644665999L;
        assertEquals(expectedMaxPalindrome, returnedMaxPalindrome);
    }


}
