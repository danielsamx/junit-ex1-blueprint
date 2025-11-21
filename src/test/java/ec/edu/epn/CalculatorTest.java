package ec.edu.epn;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void add_TwoPositiveNumbers_ReturnCorrectSum(){
        int a = 3;
        int b = 4;
        int result = calculator.add(a, b);
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

    @ParameterizedTest
    @ValueSource(ints = {2,30,-6,0})
    void isEven_MultipleNumbers_ShouldReturnTrue(int number){
        assertTrue(calculator.isEven(number));
    }

    @Test
    void divide_TwoPositiveNumbers_ReturnsCorrectOutient() {
        double result =  calculator.divide(10, 4);
        // Usar un delta que permita comparar doubles con el fin de evitar problemas de presición
        assertEquals(2.5, result, 0.0001, "10 dividido por 4 es 2.5");
    }

    @Test
    void divide_ByZero_ReturnsCorrecException() {
        int a = 3;
        int b = 0;
        assertThrows(IllegalArgumentException.class,()-> calculator.divide(a,b), "Dividir por cero debe lanzar una excepción");
    }

    @Test
    void divide_ByZero_ReturnsCorrectException() {
        IllegalArgumentException  exception = assertThrows(IllegalArgumentException.class,()-> calculator.divide(3,0));
        assertEquals("The divisor cannot be zero.", exception.getMessage());
    }
}
