package com.rmd.personal.projecteuler;

import java.math.BigInteger;

import org.junit.Test;

import static org.junit.Assert.*;

public class P013Test extends AbstractProblemTestBase<P013> {

    public P013Test() {
        super(new P013());
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        BigInteger returned = new BigInteger(this.getProblem().run());

        // Assert
        final BigInteger expected = new BigInteger("5537376230390876637302048746832985971773659831892672");
        assertEquals(expected, returned);
    }
}
