package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem25Test extends AbstractProblemTestBase<Problem25> {

    public Problem25Test() {
        super(new Problem25());
    }

    @Test
    public void runReturnsCorrectlyFor3digits() {
        // Arrange
        final int numberOfDigits = 3;
        this.getProblem().setNumberOfDigits(numberOfDigits);

        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 12;
        assertEquals(expected, returned);
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 4782;
        assertEquals(expected, returned);
    }
}
