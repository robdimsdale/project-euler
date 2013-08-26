package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem8Test extends AbstractProblemTestBase<Problem8> {

    public Problem8Test() {
        super(new Problem8());
    }

    @Test
    public void runReturnsCorrectlyForConsecutiveCount4() {
        // Arrange
        final int primeIndex = 4;
        this.getProblem().setNumberOfConsecutiveDigits(primeIndex);

        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 9 * 9 * 8 * 9;
        assertEquals(expected, returned);
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 40824L;
        assertEquals(expected, returned);
    }
}
