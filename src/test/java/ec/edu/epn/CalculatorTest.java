package ec.edu.epn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    void add_TwoPositiveNumbers_ReturnCorrectSum(){
        // Arrange
        int a = 3;
        int b = 4;
        // Act
        int result = calculator.add(a, b);
        // Assert
        assertEquals(7, result);
    }

    @Test
    void subtract_TwoPositiveNumbers_ReturnCorrectSubtract(){
        int a = 3;
        int b = 4;
        int result = calculator.subtract(a, b);
        assertEquals(-1, result);
    }

    @Test
    void multiply_TwoPositiveNumbers_ReturnCorrectMultiply(){
        int a = 3;
        int b = 4;
        int result = calculator.multiply(a, b);
        assertEquals(12, result);
    }

    @Test
    void divide_TwoPositiveNumbers_ReturnCorrectDivide(){
        int a = 20;
        int b = 4;
        double result = calculator.divide(a, b);
        assertEquals(5.0, result);
    }

    @Test
    void isEven_Pair_ReturnCorrect(){
        int a = 6;
        boolean result = calculator.isEven(a);
        assertTrue(result);
    }
}
