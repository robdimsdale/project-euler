package com.rmd.personal.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem11Test extends AbstractProblemTestBase<Problem11> {

    public Problem11Test() {
        super(new Problem11());
    }

    @Test
    public void runReturnsCorrectlyForMaxPrime10() {
        // Arrange
        final int startColumn = 8;
        final int endColumn = startColumn;
        final int startRow = 6;
        final int endRow = startRow;

        this.getProblem().setStartColumn(startColumn);
        this.getProblem().setEndColumn(endColumn);
        this.getProblem().setStartRow(startRow);
        this.getProblem().setEndRow(endRow);
        this.getProblem().clearAllPossibleDirections();
        this.getProblem().addPossibleDirection(Problem11.Direction.DIAGONAL_DOWN_RIGHT);

        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 1788696L;
        assertEquals(expected, returned);
    }

    @Test
    public void runReturnsCorrectlyForDefault() {
        // Act
        long returned = Long.valueOf(this.getProblem().run());

        // Assert
        final long expected = 70600674L;
        assertEquals(expected, returned);
    }
}
