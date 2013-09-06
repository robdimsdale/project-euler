package com.rmd.personal.projecteuler;

import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommonTest {

    @Test
    public void findFactorTreeReturnsCorrectlyFor2DigitNumber() {
        // Arrange
        final long value = 12L;

        // Act
        Map<Long, Integer> primeFactorTree = Common.findPrimeFactorTreeForValue(value);

        // Assert
        assertEquals(2, primeFactorTree.size());
        assertEquals((Integer) 2, primeFactorTree.get(2L));
        assertEquals((Integer) 1, primeFactorTree.get(3L)); // SUPPRESS CHECKSTYLE magicNumber
    }

    @Test
    public void findFactorTreeReturnsCorrectlyFor7DigitNumber() {
        // Arrange
        final long value = 8004150L;

        // Act
        Map<Long, Integer> primeFactorTree = Common.findPrimeFactorTreeForValue(value);

        // Assert
        assertEquals(5, primeFactorTree.size()); // SUPPRESS CHECKSTYLE magicNumber
        assertEquals((Integer) 1, primeFactorTree.get(2L));
        assertEquals((Integer) 3, primeFactorTree.get(3L)); // SUPPRESS CHECKSTYLE magicNumber
        assertEquals((Integer) 2, primeFactorTree.get(5L)); // SUPPRESS CHECKSTYLE magicNumber
        assertEquals((Integer) 2, primeFactorTree.get(7L)); // SUPPRESS CHECKSTYLE magicNumber
        assertEquals((Integer) 2, primeFactorTree.get(11L)); // SUPPRESS CHECKSTYLE magicNumber
    }

    @Test
    @Ignore
    public void findFactorTreeReturnsCorrectlyForLargePrime() {
        // Arrange
        final int powerOf2 = 3;
        final int powerOf3 = 5;
        final int powerOf17 = 2;
        final int powerOf19 = 2;
        final long value = (long)
                (Math.pow(2, powerOf2) * Math.pow(3, powerOf3) * Math.pow(17, powerOf17) * Math.pow(19, powerOf19)); // SUPPRESS CHECKSTYLE magicNumber

        // Act
        Map<Long, Integer> primeFactorTree = Common.findPrimeFactorTreeForValue(value);

        // Assert
        assertEquals(4, primeFactorTree.size()); // SUPPRESS CHECKSTYLE magicNumber
        assertEquals((Integer) powerOf2, primeFactorTree.get(2L));
        assertEquals((Integer) powerOf3, primeFactorTree.get(3L)); // SUPPRESS CHECKSTYLE magicNumber
        assertEquals((Integer) powerOf17, primeFactorTree.get(17L)); // SUPPRESS CHECKSTYLE magicNumber
        assertEquals((Integer) powerOf19, primeFactorTree.get(19L)); // SUPPRESS CHECKSTYLE magicNumber
    }
}
