package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem67Test extends AbstractProblemTestBase<Problem67> {

    public Problem67Test() {
        super(new Problem67());
    }

    @Test
    public void runReturnsCorrectlyForProvided() {
        // Arrange
        this.getProblem().setProvided(true);

        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 23;
        assertEquals(expected, returned);
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 7273;
        assertEquals(expected, returned);
    }
}
