package lesson4;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest {

    @Test
    public void SumTest() {
        int expectedSum = Calc.Sum(2, 4);
        int actualSum = 6;
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void MinusTest() {
        int expectedSum = Calc.Minus(7, 4);
        int actualSum = 3;
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void MultTest() {
        int expectedSum = Calc.Mult(2, 2);
        int actualSum = 4;
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void DivisionTest() {
        int expectedSum = Calc.Division(4, 2);
        int actualSum = 2;
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void PowTest() {
        int expectedSum = Calc.Pow(2, 3);
        int actualSum = 8;
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void FactTest() {
        int expectedSum = Calc.Fact(3);
        int actualSum = 6;
        assertEquals(expectedSum, actualSum);
    }

}
