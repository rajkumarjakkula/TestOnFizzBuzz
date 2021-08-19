import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    public FizzBuzz fizzBuzz=null;
    @BeforeEach
    void CreateObject(){
        fizzBuzz=new FizzBuzz();
    }

    @Test
    void onNumberDivisibleByThreeReturnFizz()
    {
        String actualValue = fizzBuzz.FizzBuzzFunction(36);
        String expectedValue = "Fizz";
        assertEquals(actualValue,expectedValue);
    }

    @Test
    void  onNumberDivisibleByFiveReturnBuzz()
    {
        String actualValue = fizzBuzz.FizzBuzzFunction(35);
        String expectedValue = "Buzz";
        assertEquals(actualValue,expectedValue);
    }

    @Test
    void  onNumberNotDivisibleByFiveAndThreeReturnNumber()
    {
        String actualValue = fizzBuzz.FizzBuzzFunction(32);
        String expectedValue = Integer.toString(32);
        assertEquals(actualValue,expectedValue);
    }

    @Test
    void  onNumberContainingThreeReturnFizz()
    {
        String actualValue = fizzBuzz.FizzOrBuzz(31);
        String expectedValue = "Fizz";
        assertEquals(actualValue,expectedValue);
    }

    @Test
    void  onNumberContainingFiveReturnFizz()
    {
        String actualValue = fizzBuzz.FizzOrBuzz(52);
        String expectedValue = "Buzz";
        assertEquals(actualValue,expectedValue);
    }

    @Test
    void  onNumberDivisibleByBothThreeAndFiveReturnFizzBuzz()
    {
        String actualValue = fizzBuzz.FizzOrBuzz(45);
        String expectedValue = "FizzBuzz";
        assertEquals(actualValue,expectedValue);
    }
}
