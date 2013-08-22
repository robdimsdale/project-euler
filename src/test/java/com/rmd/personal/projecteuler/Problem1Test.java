package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem1Test extends AbstractProblemTestBase<Problem1> {

    public Problem1Test() {
        super(new Problem1());
    }

    @Test
    public void runReturnsCorrectlyForProvidedMaxValue() {
        // Arrange
        final int providedMaxValue = 10;
        this.getProblem().setMaxValue(providedMaxValue);

        // Act
        int returnedSum = Integer.valueOf(this.getProblem().run());

        // Assert
        final int expectedSum = 23;
        assertEquals(expectedSum, returnedSum);
    }

    @Test
    public void runReturnsCorrectlyForMaxValue16() {
        // Arrange
        final int someMaxValue = 16;
        this.getProblem().setMaxValue(someMaxValue);

        // Act
        int returnedSum = Integer.valueOf(this.getProblem().run());

        // Assert
        final int expectedSum = 60;
        assertEquals(expectedSum, returnedSum);
    }

    @Test
    public void runReturnsCorrectlyForDesiredMaxValue() {
        // Arrange
        final int desiredMaxValue = 1000;
        this.getProblem().setMaxValue(desiredMaxValue);

        // Act
        int returnedSum = Integer.valueOf(this.getProblem().run());

        // Assert
        final int expectedSum = 233168;
        assertEquals(expectedSum, returnedSum);
    }


}
