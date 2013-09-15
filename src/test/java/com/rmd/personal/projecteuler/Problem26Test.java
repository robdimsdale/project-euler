package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem26Test extends AbstractProblemTestBase<Problem26> {

    public Problem26Test() {
        super(new Problem26());
    }

    @Test
    public void runReturnsCorrectlyForProvided() {
        // Arrange
        final int maxD = 10;
        this.getProblem().setMaxD(maxD);

        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 7;
        assertEquals(expected, returned);
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 983;
        assertEquals(expected, returned);
    }
}
