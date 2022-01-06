package tasks.t14;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleTest {
    @Test
    void testSetNumberOfRowsPositiveCase() {
        int expected = 4;
        PascalsTriangle.setNumberOfRows(4);

        assertEquals(expected, PascalsTriangle.numberOfRows);
    }

    @Test
    void testSetNumberOfRowsNegativeCase() {
        assertThrows(IllegalArgumentException.class, () -> PascalsTriangle.setNumberOfRows(-1));
    }

    @Test
    void testFillPascalsTriangleWhenArraysEquals() {
        int[][] expected = {{1}, {1, 1}};

        int[][] actual = PascalsTriangle.fillPascalsTriangle(2);

        assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    void testFillPascalsTriangleWhenArraysNotEquals() {
        int[][] expected = {{1}, {1, 1}, {3,2}};

        int[][] actual = PascalsTriangle.fillPascalsTriangle(2);

        assertFalse(Arrays.deepEquals(expected, actual));
    }

    @Test
    void testGetRow() {

        PascalsTriangle.setNumberOfRows(7);
        PascalsTriangle.fillPascalsTriangle(PascalsTriangle.numberOfRows);
        StringBuilder actual = PascalsTriangle.getRows(4);

        assertEquals("1 3 3 1 ", actual.toString());
    }
}
