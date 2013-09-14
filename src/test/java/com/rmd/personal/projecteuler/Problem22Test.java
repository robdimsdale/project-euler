package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem22Test extends AbstractProblemTestBase<Problem22> {

    public Problem22Test() {
        super(new Problem22());
    }

    @Test
    public void runReturnsCorrectlyForProvided() {
        // Arrange
        final int start = 938;
        final int end = 938;
        this.getProblem().setStart(start - 1);
        this.getProblem().setEnd(end);

        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = start * 53;
        assertEquals(expected, returned);
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 871198282;
        assertEquals(expected, returned);
    }
}
