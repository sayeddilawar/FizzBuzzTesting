import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FizzBuzzTest
{

    @Test
    void toCheckNumberIsFizz()
    {
        FizzBuzz object = new FizzBuzz(3);
        assertEquals("Fizz",object.checkFizzOrBuzz());
    }

    @Test
    void toCheckNumberIsBuzz()
    {
        FizzBuzz object = new FizzBuzz(5);
        assertEquals("Buzz",object.checkFizzOrBuzz());
    }

    @Test
    void toCheckNumberIsFizzBuzz()
    {
        FizzBuzz object = new FizzBuzz(30);
        assertNotEquals("FizzBuzz",object.checkFizzOrBuzz());
    }

    @Test
    void toCheckNumberIsNull()
    {
        FizzBuzz object = new FizzBuzz(-2);
        assertEquals("null",object.checkFizzOrBuzz());
    }

    @Test
    void toCheckNumberIsInOrDivisibleByThree()
    {
        FizzBuzz object = new FizzBuzz(37);
        assertEquals("Fizz",object.checkNumberIsIn());
    }

    @Test
    void toCheckNumberIsInOrDivisibleByFive()
    {
        FizzBuzz object = new FizzBuzz(55);
        assertEquals("Buzz",object.checkNumberIsIn());
    }


}
