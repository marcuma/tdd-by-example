package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created: 11/17/2021 - 1:14 PM
 * Project: tdd-by-example
 *
 * @author marcuma
 */


public class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
            five.times(2);
            assertEquals(10, five.amount);

    }
}
