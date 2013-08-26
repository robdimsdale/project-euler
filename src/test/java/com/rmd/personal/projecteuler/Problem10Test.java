package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem10Test extends AbstractProblemTestBase<Problem10> {

    public Problem10Test() {
        super(new Problem10());
    }

    @Test
    public void runReturnsCorrectlyForMaxPrime10() {
        // Arrange
        final int maxPrime = 10;
        this.getProblem().setMaxPrime(maxPrime);

        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 17;
        assertEquals(expected, returned);
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 142913828922L;
        assertEquals(expected, returned);
    }
}
