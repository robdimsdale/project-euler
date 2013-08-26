package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem6Test extends AbstractProblemTestBase<Problem6> {

    public Problem6Test() {
        super(new Problem6());
    }

    @Test
    public void runReturnsCorrectlyForMaxNumber10() {
        // Arrange
        final int maxNumber = 10;
        this.getProblem().setMaxNumber(maxNumber);

        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 2640L;
        assertEquals(expected, returned);
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 25164150L;
        assertEquals(expected, returned);
    }
}
