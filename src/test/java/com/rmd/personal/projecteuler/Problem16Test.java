package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem16Test extends AbstractProblemTestBase<Problem16> {

    public Problem16Test() {
        super(new Problem16());
    }

    @Test
    public void runReturnsCorrectlyForProvided() {
        // Arrange
        final int power = 15;
        this.getProblem().setPower(power);

        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 26;
        assertEquals(expected, returned);
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 1366L;
        assertEquals(expected, returned);
    }
}
