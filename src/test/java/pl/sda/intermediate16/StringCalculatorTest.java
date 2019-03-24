package pl.sda.intermediate16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    void shouldReturnZeroWhenTextIsEmpty() {
        Integer result = StringCalculator.adding("");
        Assertions.assertTrue(result.equals(0));
    }

    @Test
    void shouldReturnNumberWhenTextIsOneNumber() {
        Integer result = StringCalculator.adding("3");
        Assertions.assertTrue(result.equals(3));
    }

    @Test
    void shouldReturnSumWhenTextContainsNumbersSeparatedWithComma() {
        Integer result = StringCalculator.adding("3,2 ");
        Assertions.assertTrue(result.equals(5));
    }

    @Test
    void shouldReturnSumWhenTextContainsNumbersSeparatedWithCommaOrNewLineSymbol() {
        Integer result = StringCalculator.adding("3,2 \n4");
        Assertions.assertTrue(result.equals(9));
    }

    @Test
    void shouldReturnSumWhenTextContainsNumbersSeparatedWithCustomDelimiter() {
        Integer result = StringCalculator.adding("//s\n3s2s 4");
        Assertions.assertTrue(result.equals(9));
    }

//    @Test
    void shouldThrowExceptionWhenTextContainsNegativeNumbers() {

        runnable.run();


        Assertions.assertThrows(
                NegativeNumberFoundException.class,
                ()->StringCalculator.adding("//s\n3s-2s -4"));
    }

    Runnable runnable = () -> System.out.println("OK");



}
