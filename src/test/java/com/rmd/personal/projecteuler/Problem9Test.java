package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem9Test extends AbstractProblemTestBase<Problem9> {

    public Problem9Test() {
        super(new Problem9());
    }

    @Test
    public void runReturnsCorrectlyForTripletSum25() {
        // Arrange
        final int tripletSum = 12;
        this.getProblem().setTripletSum(tripletSum);

        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 3 * 4 * 5;
        assertEquals(expected, returned);
    }

    @Test
    public void runReturnsCorrectlyForTripletSum1000() {
        // Arrange
        final int tripletSum = 1000;
        this.getProblem().setTripletSum(tripletSum);

        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 31875000L;
        assertEquals(expected, returned);
    }
}
