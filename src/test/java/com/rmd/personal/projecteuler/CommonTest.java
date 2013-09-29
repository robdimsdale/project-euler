package com.rmd.personal.projecteuler;

import org.junit.Ignore;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Map;

import static org.junit.Assert.*;

public class CommonTest {

    @Test
    public void constructorIsPrivate() throws Exception {
        // Act
        Constructor<?>[] constructors = Common.class.getDeclaredConstructors();

        // Assert
        assertEquals(1, constructors.length);
        assertTrue(Modifier.isPrivate(constructors[0].getModifiers()));
    }

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
    public void findFactorTreeReturnsCorrectlyFor3DigitNumber() {
        // Arrange
        final long value = 420;

        // Act
        Map<Long, Integer> primeFactorTree = Common.findPrimeFactorTreeForValue(value);

        // Assert
        assertEquals(4, primeFactorTree.size()); // SUPPRESS CHECKSTYLE magicNumber
        assertEquals((Integer) 2, primeFactorTree.get(2L));
        assertEquals((Integer) 1, primeFactorTree.get(3L)); // SUPPRESS CHECKSTYLE magicNumber
        assertEquals((Integer) 1, primeFactorTree.get(5L)); // SUPPRESS CHECKSTYLE magicNumber
        assertEquals((Integer) 1, primeFactorTree.get(7L)); // SUPPRESS CHECKSTYLE magicNumber
    }

    @Test
    @Ignore
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

    @Test
    public void factorialReturnsCorrectlyFor0() {
        // Arrange
        final long n = 0;

        // Act
        long actualResult = Common.factorial(n);

        // Assert
        final long expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void factorialReturnsCorrectlyFor1() {
        // Arrange
        final long n = 1;

        // Act
        long actualResult = Common.factorial(n);

        // Assert
        final long expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void factorialReturnsCorrectlyFor2() {
        // Arrange
        final long n = 2;

        // Act
        long actualResult = Common.factorial(n);

        // Assert
        final long expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void factorialReturnsCorrectlyFor3() {
        // Arrange
        final long n = 3;

        // Act
        long actualResult = Common.factorial(n);

        // Assert
        final long expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void factorialReturnsCorrectlyFor39() {
        // Arrange
        final long n = 39;

        // Act
        long actualResult = Common.factorial(n);

        // Assert
        final long expectedResult = 2304077777655037952L;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void factorialThrowsExceptionForGreaterThan39() {
        // Arrange
        final long n = -1;

        // Act & Assert
        boolean caughtCorrectException = false;
        try {
            Common.factorial(n);
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("non-negative"));
            caughtCorrectException = true;
        }

        assertTrue(caughtCorrectException);
    }

    @Test
    public void factorialThrowsExceptionForLessThan0() {
        // Arrange
        final long n = 40;

        // Act & Assert
        boolean caughtCorrectException = false;
        try {
            Common.factorial(n);
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("39"));
            caughtCorrectException = true;
        }

        assertTrue(caughtCorrectException);
    }

    @Test
    public void isPandigitalReturnsTrueForValidPandigitalNumber() {
        // Arrange
        final long number = 987654321L;

        // Act & assert
        assertTrue(Common.isPandigital(number));
    }

    @Test
    public void isPandigitalReturnsFalseForInvalidPandigitalNumber() {
        // Arrange
        final long number = 1234;

        // Act & assert
        assertFalse(Common.isPandigital(number));
    }

    @Test
    public void concatenateNumbersReturnsCorrectlyForValidNumbers() {
        // Arrange
        final long number1 = 1234;
        final long number2 = 56789;

        // Act
        long returned = Common.concatenateNumbers(number1, number2);

        // Assert
        final long expected = 123456789L;
        assertEquals(expected, returned);
    }
}
