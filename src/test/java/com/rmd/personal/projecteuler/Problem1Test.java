package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem1Test extends AbstractProblemTestBase<Problem1> {

    public Problem1Test() {
        super(new Problem1());
    }

    @Test
    public void runReturnsCorrectlyForProvided() {
        // Arrange
        final long providedMaxValue = 10;
        this.getProblem().setMaxValue(providedMaxValue);

        // Act
        long returnedSum = Integer.valueOf(this.getProblem().run());

        // Assert
        final long expectedSum = 23;
        assertEquals(expectedSum, returnedSum);
    }

    @Test
    public void runReturnsCorrectlyForMaxValue16() {
        // Arrange
        final long someMaxValue = 16;
        this.getProblem().setMaxValue(someMaxValue);

        // Act
        long returnedSum = Integer.valueOf(this.getProblem().run());

        // Assert
        final long expectedSum = 60;
        assertEquals(expectedSum, returnedSum);
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        long returnedSum = Integer.valueOf(this.getProblem().run());

        // Assert
        final long expectedSum = 233168;
        assertEquals(expectedSum, returnedSum);
    }


}
