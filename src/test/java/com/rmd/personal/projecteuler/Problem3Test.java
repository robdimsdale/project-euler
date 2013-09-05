package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem3Test extends AbstractProblemTestBase<Problem3> {

    public Problem3Test() {
        super(new Problem3());
    }

    @Test
    public void runReturnsCorrectlyForProvided() {
        // Arrange
        final long aMaxValue = 13195L;
        this.getProblem().setNumberValue(aMaxValue);

        // Act
        long returnedMaxPrimeFactor = Integer.valueOf(this.getProblem().run());

        // Assert
        final long expectedMaxPrimeFactor = 29;
        assertEquals(expectedMaxPrimeFactor, returnedMaxPrimeFactor);
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        long returnedMaxPrimeFactor = Integer.valueOf(this.getProblem().run());

        // Assert
        final long expectedMaxPrimeFactor = 6857L;
        assertEquals(expectedMaxPrimeFactor, returnedMaxPrimeFactor);
    }


}
