package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class P031Test extends AbstractProblemTestBase<P031> {

    public P031Test() {
        super(new P031());
    }

    @Test
    public void runReturnsCorrectlyFor2() {
        // Arrange
        final int total = 2;
        this.getProblem().setTotal(total);

        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 2;
        assertEquals(expected, returned);
    }

    @Test
    public void runReturnsCorrectlyFor3() {
        // Arrange
        final int total = 3;
        this.getProblem().setTotal(total);

        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 2;
        assertEquals(expected, returned);
    }

    @Test
    public void runReturnsCorrectlyFor5() {
        // Arrange
        final int total = 5;
        this.getProblem().setTotal(total);

        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 4;
        assertEquals(expected, returned);
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 73682;
        assertEquals(expected, returned);
    }
}
