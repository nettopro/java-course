package app.calculation.internal;

import java.util.Arrays;

/**
 * Provides internal arithmetic operations used in calculations.
 */

public class ArithmeticOperations {

    public final double sum(final double... nums) {
        return Arrays.stream(nums).reduce(0.0, (t, a) -> t + a);
    }
}
