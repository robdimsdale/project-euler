package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem14Test extends AbstractProblemTestBase<Problem14> {

    public Problem14Test() {
        super(new Problem14());
    }

    @Test
    public void runReturnsCorrectlyForProvided() {
        // Arrange
        final int startVal = 13;
        this.getProblem().setStartVal(startVal);
        this.getProblem().setEndVal(startVal);

        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 13L;
        assertEquals(expected, returned);
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 837799L;
        assertEquals(expected, returned);
    }
}
