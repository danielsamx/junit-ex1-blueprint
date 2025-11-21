package ec.edu.epn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailValidatorTest {

    private  EmailValidator emailValidator;

    static Stream<Arguments> emailValidatorData() {
        Stream<Arguments> ret =  Stream.of(
                Arguments.of("danielsam@example.com", true),
                Arguments.of("daniel.sam@example.com", true),
                Arguments.of("danielsam", false),
                Arguments.of(null, false)
        );
        return ret;
    }

    @BeforeEach
    public void setUp()
    {
        emailValidator = new EmailValidator();
    }

    @ParameterizedTest
    @MethodSource("emailValidatorData")
    void isValid_MultipleEmails_ShouldReturnTrue(String email, boolean expected){
        boolean result = emailValidator.isValid(email);
        assertEquals(expected, result);
    }
}
