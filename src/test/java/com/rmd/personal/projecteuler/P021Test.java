package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class P021Test extends AbstractProblemTestBase<P021> {

    public P021Test() {
        super(new P021());
    }

    @Test
    public void runReturnsCorrectlyForProvided() {
        // Arrange
        final int end = 284;
        this.getProblem().setEnd(end + 1);

        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 220 + end; // SUPPRESS CHECKSTYLE magicNumber
        assertEquals(expected, returned);
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 31626;
        assertEquals(expected, returned);
    }
}
