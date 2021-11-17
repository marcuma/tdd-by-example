package guru.springframework;

/**
 * Created: 11/17/2021 - 1:17 PM
 * Project: tdd-by-example
 *
 * @author marcuma
 */

public class Dollar {

    public float amount;

    public Dollar(float amount) {
        this.amount = amount;
    }

    public void times(float multiplier) {
        amount *= multiplier;
    }



}
