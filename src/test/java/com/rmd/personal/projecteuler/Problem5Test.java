package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem5Test extends AbstractProblemTestBase<Problem5> {

    public Problem5Test() {
        super(new Problem5());
    }

    @Test
    public void runReturnsCorrectlyForProvided() {
        // Arrange
        final int maxFactor = 10;
        this.getProblem().setMaxFactor(maxFactor);

        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 2520L;
        assertEquals(expected, returned);
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 232792560L;
        assertEquals(expected, returned);
    }
}
