package ec.edu.epn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringValidatorTest {

    private StringValidator stringValidator;

    @BeforeEach
    public void setUp()
    {
        stringValidator = new StringValidator();
    }

    private static class TestData{
        final String input;
        final boolean expectedResult;

        public TestData(String input, boolean expectedResult){
            this.input = input;
            this.expectedResult = expectedResult;
        }
    }

    @TestFactory
    Collection<DynamicTest> dynamicPalindromeTest(){
        List<TestData> testDataList = Arrays.asList(
                new TestData("reconocer", true),
                new TestData("oso", true),
                new TestData("Hola", false)
        );
        return testDataList.stream()
                .map(data->DynamicTest.dynamicTest("Verifición Palindromo " + data.input, ()->{
                    boolean methodResults = stringValidator.isPalindrome(data.input);
                    if(data.expectedResult){
                        assertTrue(methodResults);
                    }else{
                        assertFalse(methodResults);
                    }
                })).collect(Collectors.toList());
    }
}
