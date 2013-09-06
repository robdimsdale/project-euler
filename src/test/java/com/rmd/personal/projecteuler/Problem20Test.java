package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem20Test extends AbstractProblemTestBase<Problem20> {

    public Problem20Test() {
        super(new Problem20());
    }

    @Test
    public void runReturnsCorrectlyForProvided() {
        // Arrange
        final int n = 10;
        this.getProblem().setN(n);

        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 27;
        assertEquals(expected, returned);
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 648;
        assertEquals(expected, returned);
    }
}
