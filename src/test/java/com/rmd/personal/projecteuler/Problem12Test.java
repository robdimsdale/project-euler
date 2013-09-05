package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem12Test extends AbstractProblemTestBase<Problem12> {

    public Problem12Test() {
        super(new Problem12());
    }

    @Test
    public void runReturnsCorrectlyForProvided() {
        // Arrange
        final int numberOfDivisors = 5;
        this.getProblem().setNumberOfDivisors(numberOfDivisors);

        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 28;
        assertEquals(expected, returned);
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 76576500L;
        assertEquals(expected, returned);
    }
}
