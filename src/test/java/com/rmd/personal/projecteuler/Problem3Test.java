package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem3Test extends AbstractProblemTestBase<Problem3> {

    public Problem3Test() {
        super(new Problem3());
    }

    @Test
    public void runReturnsCorrectlyForProvidedNumberValue13195() {
        // Arrange
        final long aMaxValue = 13195L;
        this.getProblem().setNumberValue(aMaxValue);

        // Act
        int returnedMaxPrimeFactor = Integer.valueOf(this.getProblem().run());

        // Assert
        final int expectedMaxPrimeFactor = 29;
        assertEquals(expectedMaxPrimeFactor, returnedMaxPrimeFactor);
    }

    @Test
    public void runReturnsCorrectlyForDesiredMaxValue() {
        // Arrange
        final long desiredMaxValue = 600851475143L;
        this.getProblem().setNumberValue(desiredMaxValue);

        // Act
        int returnedMaxPrimeFactor = Integer.valueOf(this.getProblem().run());

        // Assert
        final int expectedMaxPrimeFactor = 4613732;
        assertEquals(expectedMaxPrimeFactor, returnedMaxPrimeFactor);
    }


}
