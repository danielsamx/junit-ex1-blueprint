package ec.edu.epn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {

    private  TaxCalculator taxCalculator;

    static Stream<Arguments> taxCalculatorData() {
        Stream<Arguments> ret =  Stream.of(
                Arguments.of(100.00, 10, 110.00),
                Arguments.of(50.00, 5, 52.50),
                Arguments.of(88.00, 37, 120.56),
                Arguments.of(540, 21, 653.40)
        );
        return ret;
    }

    @BeforeEach
    public void setUp()
    {
        taxCalculator = new TaxCalculator();
    }

    @ParameterizedTest
    @MethodSource("taxCalculatorData")
    void isValid_MultipleTax_ShouldReturnTrue(double amount, double tax, double expected){
        double result = taxCalculator.calculateTax(amount,tax);
        assertEquals(expected, result);
    }
}
