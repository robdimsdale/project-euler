package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test extends AbstractProblemTestBase<Problem2> {

    public Problem2Test() {
        super(new Problem2());
    }

    @Test
    public void runReturnsCorrectlyForProvidedMaxValue90() {
        // Arrange
        final int aMaxValue = 90;
        this.getProblem().setMaxValue(aMaxValue);

        // Act
        int returnedSum = Integer.valueOf(this.getProblem().run());

        // Assert
        final int expectedSum = 44;
        assertEquals(expectedSum, returnedSum);
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        int returnedSum = Integer.valueOf(this.getProblem().run());

        // Assert
        final int expectedSum = 4613732;
        assertEquals(expectedSum, returnedSum);
    }


}
