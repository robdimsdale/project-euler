package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class P023Test extends AbstractProblemTestBase<P023> {

    public P023Test() {
        super(new P023());
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
