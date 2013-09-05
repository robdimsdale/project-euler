package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem18Test extends AbstractProblemTestBase<Problem18> {

    public Problem18Test() {
        super(new Problem18());
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
        final long expected = 1074;
        assertEquals(expected, returned);
    }
}
