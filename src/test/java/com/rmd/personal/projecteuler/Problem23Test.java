package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem23Test extends AbstractProblemTestBase<Problem23> {

    public Problem23Test() {
        super(new Problem23());
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 4179871;
        assertEquals(expected, returned);
    }
}
